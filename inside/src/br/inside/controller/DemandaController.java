package br.inside.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import br.inside.model.entity.Arquivo;
import br.inside.model.entity.Comentario;
import br.inside.model.entity.Demanda;
import br.inside.model.entity.Funcionario;
import br.inside.model.entity.User;
import br.inside.model.service.ArquivoService;
import br.inside.model.service.ComentarioService;
import br.inside.model.service.DemandaService;
import br.inside.model.service.FuncionarioService;
import br.inside.model.service.ProducaoService;

@Controller
public class DemandaController {

	@Autowired
	private DemandaService demandaService;
	
	@Autowired
	private FuncionarioService funcionarioService;

	@Autowired
	private ProducaoService producaoService;
	
	@Autowired
	private ComentarioService comentarioService;
	
	@Autowired
	private ArquivoService arquivoService;
	
	@RequestMapping("/demandas")
	public String demandasView(Model model, HttpSession session, String chave) throws IOException {
		
		List<Demanda> lista;
		
		if (chave != null && chave.length() > 0) {
			lista = demandaService.listarDemandas(chave);
		} else {
			User u = (User) session.getAttribute("usuario");
			Funcionario f = funcionarioService.buscarFuncionario(u);
			lista = demandaService.listarDemandasPorAnalista(f);
		}
		
		session.setAttribute("lista", lista);
		return "Demandas";
	}
	
	@RequestMapping("/novaDemanda")
	public String novoDemandaForm(Model model, HttpSession session, int idProjeto) {			
		try {
			List<Funcionario> analistas = funcionarioService.listarFuncionarios();
			session.setAttribute("idProjeto", idProjeto);
			model.addAttribute("analistas", analistas);
			return "CadastroDemanda";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "CadastroDemanda";
		}		
	}
	
	@RequestMapping("/addDemanda")
	public String addDemanda(@Valid Demanda demanda, Model model, HttpSession session) {
		try {			
			
			Funcionario funcionario = new Funcionario();
			funcionario.setIdFuncionario(demanda.getFuncionario().getIdFuncionario());
			funcionario = funcionarioService.buscarFuncionario(funcionario.getIdFuncionario());
			demanda.setFuncionario(funcionario);
			
			if(demandaService.validPeriod(demanda)) {
				demanda = demandaService.criar(demanda);
				model.addAttribute("projeto", demanda);
				return "redirect: projetos";
			} else {
				String error = "O analista j� possui tarefas agendadas para este per�odo.";
				session.setAttribute("error", error);
				return "redirect: novaDemanda?idProjeto=4";
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
			return "CadastroDemanda";
		}	
	}
	
	/*@RequestMapping("/atualizarDemanda")
	public String atualizarProjeto(@Valid Demanda demanda, Model model, HttpSession session) {
		demanda = demandaService.atualizar(demanda);
		model.addAttribute("demanda", demanda);
		
		return "DetalheDemanda";
	}
	*/
	
	@RequestMapping("/editarDemanda")
	public String editarDemanda(Model model, HttpSession session, int idDemanda) throws IOException {
		List<Funcionario> analistas = funcionarioService.listarFuncionarios();
		Demanda demanda = demandaService.buscarDemanda(idDemanda);	
		
		model.addAttribute("demanda", demanda);
		model.addAttribute("analistas", analistas);
		System.out.println(demanda);
		return "EditarDemanda";	
	}
	
	@RequestMapping("/atualizar_demanda")
	public String atualizarDemanda(@Valid Demanda demanda, BindingResult erros, Model model, HttpSession session) throws IOException{
		System.out.println("demanda: " + demanda);
		
		if(!erros.hasErrors()) {
			Demanda dema = new Demanda();
			dema.setDescricao(demanda.getDescricao());
			dema.setDtInicio(demanda.getDtInicio());
			dema.setDtFim(demanda.getDtFim());
			dema.setDetalhes(demanda.getDetalhes());
			dema.setFuncionario(demanda.getFuncionario());
			dema.setStatus(demanda.getStatus());			
			
			demanda = demandaService.atualizar(demanda);

			model.addAttribute("demanda", demanda);
			
			return "redirect: projetos";
			
		}else {
			System.out.println(erros.toString());
			return "redirect: editarDemanda?idDemanda=" + demanda.getId();
		}
	}
	

	@RequestMapping("/iniciarTarefa")
	public String atualizarProjeto(Model model, HttpSession session, int idDemanda) {
		demandaService.iniciarTarefa(idDemanda,producaoService);
		return "redirect: detalheDemanda?idDemanda=" + idDemanda;
	}
	
	@RequestMapping("/pausarTarefa")
	public String pausarTarefa(Model model, HttpSession session, int idDemanda) throws IOException {
		demandaService.pausarTarefa(idDemanda, producaoService);	
		
		Demanda demanda = demandaService.buscarDemanda(idDemanda);
		demanda.setDuracao(producaoService.calcularTotalProducao(demanda));
		demandaService.atualizar(demanda);
		
		try {
			return "redirect: detalheDemanda?idDemanda=" + idDemanda;
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return null;
	}
	
	@RequestMapping("/finalizarTarefa")
	public String finalizarTarefa(Model model, HttpSession session, int idDemanda) {
		Demanda d = demandaService.buscarDemanda(idDemanda);
		
		if(d.getStatus().equals("pausado")) {
			demandaService.pausarTarefa(idDemanda, producaoService);
		}
		
		Demanda demanda = demandaService.finalizarTarefa(idDemanda, producaoService);		
		model.addAttribute("demanda", demanda);
		
		return "redirect: detalheDemanda?idDemanda=" + idDemanda;
		//return "DetalheDemanda";
	}
	
	@RequestMapping("/detalheDemanda")
	public String detalheDemanda(Model model, HttpSession session, int idDemanda) {
		Demanda demanda = demandaService.buscarDemanda(idDemanda);
		demanda.setComentarios(comentarioService.listarComentarios(demanda));
		demanda.setArquivos(arquivoService.listarArquivos(demanda));
		model.addAttribute("demanda", demanda);
		return "DetalheDemanda";
	}
	
	
	@RequestMapping("/addComentario")
	public String addComentario(@Valid Comentario comentario, Model model, HttpSession session) {
		
		User usuario = (User) session.getAttribute("usuario");
		int idDemanda = comentario.getDemanda().getId();
		Date date = new Date();		
		comentario.setDtComentario(date);
		
		Demanda demanda = demandaService.buscarDemanda(idDemanda);
		comentario.setDemanda(demanda);
		comentario.setUsuario(usuario);
		comentario = demandaService.addComentario(comentario);
		
		demanda = demandaService.buscarDemanda(idDemanda);
		model.addAttribute("demanda", demanda);
		return "redirect: detalheDemanda?idDemanda=" + idDemanda;
	}
	
	@RequestMapping("/upload")
	public String upload(HttpServletRequest request, Model model, HttpSession session, String idDemanda, String nome) {
		try {
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			MultipartFile multipartFile = multipartRequest.getFile("file");
						
			String _fileName = multipartFile.getOriginalFilename();			
			System.out.println(_fileName.split("\\."));
			String _nome = nome;
			String type = _fileName.split("\\.")[1];
			
			String fileName = _nome + type;
			
			Arquivo arquivo = new Arquivo();
			
			String filePath = "C:/inside";
			File fileToSave = new File(filePath+"/"+fileName);
			
			File file = new File("C:\\inside");

	        if (!file.exists()) {
	            if (file.mkdir()) {
	            	System.out.println("Directory created!");
	            } else {
	                System.out.println("Failed to create directory!");
	            }
	        }
	        
	        arquivo.setDiretorio("C:\\inside\\" + fileName);
	        arquivo.setNome(_nome);
	        arquivo.setType(type);
			multipartFile.transferTo(fileToSave);
			
			Demanda demanda = demandaService.buscarDemanda(Integer.parseInt(idDemanda));
			arquivo.setDemanda(demanda);
			
			arquivo = demandaService.addArquivo(arquivo);
			
			demanda = demandaService.buscarDemanda(Integer.parseInt(idDemanda));
			model.addAttribute("demanda", demanda);
			
			
			System.out.println(arquivo.toString());
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect: detalheDemanda?idDemanda=" + idDemanda;
	}
	
	@RequestMapping("/cronograma")
	public String Cronograma() {
		
		return "Cronograma";
	}
}