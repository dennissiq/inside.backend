package br.inside.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sun.istack.internal.NotNull;

@Entity(name="tb_demanda")
public class Demanda {
	  
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_demanda")
	private int id;
	
	@NotNull
	@Column(name="desc_demanda")
	private String descricao;	
	
	@NotNull
	private String detalhes;
	
	@NotNull	
	private String duracao;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="id_funcionario")
	private Funcionario funcionario;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="id_projeto")
	private Projeto projeto;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	@Override
	public String toString() {
		return "Demanda [id=" + id + ", descricao=" + descricao + ", detalhes=" + detalhes + ", duracao=" + duracao
				+ ", funcionario=" + funcionario + ", projeto=" + projeto + "]";
	}
}
