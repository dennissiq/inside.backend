/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2018-11-17 16:30:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CadastroCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Fernanda%20Cosme/Documents/GitHub/inside.backend/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/inside/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1541796894586L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <!-- DESKTOP -->\r\n");
      out.write("<div class=\"invisible-xs invisible-xxs\">\r\n");
      out.write("  <div id=\"wrapper\" class=\"toggled\">\r\n");
      out.write(" \t<!-- Sidebar-->\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"pdd-15-lg-t pdd-15-md-t\">\r\n");
      out.write("          <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-11 col-md-11 \">\r\n");
      out.write("              \r\n");
      out.write("              <h6 class=\"text-gray pull-right text-bold\"><a href=\"logout\"> <i class=\"fa fa-sign-out\"></i> sair</a></h6>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-10 col-lg-10 col-lg-offset-1 col-md-offset-1\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"container-fluid pdd-30-lg-b pdd-30-md-b\">\r\n");
      out.write("     \r\n");
      out.write("              <h1 class=\"text-primary text-bold\">Novo Cliente</h1>\r\n");
      out.write("              <div class=\"mat-card-kit \">\r\n");
      out.write("  \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-md-12 col-lg-12\">\r\n");
      out.write("                  <a href=\"clientes\" class='col-md-2 col-lg-2 col-sm-2 col-xs-2'><i class=\"back fa fa-chevron-circle-left fa-3x\"></i></a> \r\n");
      out.write("                    <div class=\"col-lg-7 col-md-7 col-sm-7 col-xs-7 col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1\">\r\n");
      out.write("                      <h2 class=\"text-gray text-bold\">Cadastrar Novo Cliente</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"line-gray\"></div>\r\n");
      out.write("                <div class=\"row row-card\">\r\n");
      out.write("                  <div class=\"col-lg-12 col-md-12\">                    \r\n");
      out.write("                      <form action=\"cadastrar_cliente\" method=\"POST\" class=\"form-inline\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                          <div class=\"col-lg-6 col-md-6 pdd-30-lg-t pdd-30-md-t pdd-15-lg-l\">\r\n");
      out.write("                            <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                              <h5 for=\"nome\" class=\"text-gray\">Cliente</h5>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-9 col-md-9\">\r\n");
      out.write("                              <input type=\"text\" name=\"nome\" id=\"nome\" class=\"form-control\" required>\r\n");
      out.write("                              \r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"col-lg-6 col-md-6 pdd-30-lg-t\">\r\n");
      out.write("                            <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                              <h5 for=\"cnpj\" class=\"text-gray\">CNPJ</h5>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-9 col-md-9\">\r\n");
      out.write("                              <input type=\"text\" name=\"cnpj\" id=\"cnpj\" class=\"form-control\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>                                               \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                          <div class=\"col-lg-6 col-md-6 pdd-30-lg-t pdd-30-md-t pdd-15-lg-l\">\r\n");
      out.write("                            <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                              <h5 for=\"representante\" class=\"text-gray\">Representante</h5>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-9 col-md-9\">\r\n");
      out.write("                              <input type=\"text\" name=\"representante\" id=\"representante\" class=\"form-control\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"col-lg-6 col-md-6 pdd-30-lg-t\">\r\n");
      out.write("                            <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                              <h5 for=\"email\" class=\"text-gray\">E-mail</h5>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-9 col-md-9\">\r\n");
      out.write("                              <input type=\"text\" name=\"email\" id=\"email\" class=\"form-control\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>                                               \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                          <div class=\"col-lg-6 col-md-6 pdd-30-lg-t pdd-30-md-t pdd-15-lg-l\">\r\n");
      out.write("                            <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                              <h5 for=\"telefone\" class=\"text-gray\">Telefone</h5>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-9 col-md-9\">\r\n");
      out.write("                              <input type=\"text\" name=\"telefone\" id=\"telefone\" class=\"form-control\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>  \r\n");
      out.write("                          <div class=\"col-lg-6 col-md-6 pdd-30-lg-t pdd-30-md-t pdd-15-lg-l\">\r\n");
      out.write("                            <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                              <h5 for=\"endereco\" class=\"text-gray\">Endereço</h5>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-9 col-md-9\">\r\n");
      out.write("                              <input type=\"text\" name=\"endereco\" id=\"endereco\" class=\"form-control\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>                                              \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\" >\r\n");
      out.write("                          <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4 col-lg-offset-4 col-md-offset-4 col-sm-offset-4 col-xs-offset-4 pdd-50-lg-t pdd-50-md-t pdd-30-lg-b pdd-30-md-b\">\r\n");
      out.write("                            <button id=\"success-create\" type=\"submit\" name=\"acao\" class=\" btn btn-lg btn-primary text-white btn-block botao-cadastrar\">Cadastrar</button>\r\n");
      out.write("                          </div>                     \r\n");
      out.write("                        </div>                         \r\n");
      out.write("                      </form>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- MOBILE -->\r\n");
      out.write("<div class=\"invisible-md invisible-lg invisible-xlg\" style=\"overflow-x: hidden;\">\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"pdd-15-lg-t pdd-15-md-t\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-md-10 col-lg-10 col-lg-offset-1 col-md-offset-1\">\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"container-fluid pdd-30-lg-b pdd-30-md-b\">\r\n");
      out.write("    \r\n");
      out.write("          <h2 class=\"text-primary text-bold\">Novo Cliente</h2>\r\n");
      out.write("          <div class=\"mat-card-kit \">\r\n");
      out.write("    \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                <div class=\"\">\r\n");
      out.write("\r\n");
      out.write("                  <a href=\"clientes\" class='col-md-2 col-lg-2 col-xxs-2 col-xs-2 pdd-15-xs-t pdd-15-xxs-t'><i class=\"back fa fa-chevron-circle-left fa-3x\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xxs-7 col-xs-7 col-lg-offset-1 col-md-offset-1 col-xxs-offset-1 col-xs-offset-1\">\r\n");
      out.write("                  <h3 class=\"text-gray text-bold\">Cadastrar Novo Cliente</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"line-gray\"></div>\r\n");
      out.write("            <div class=\"row row-card\">\r\n");
      out.write("              <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                <form action=\"cadastrar_cliente\" method=\"POST\" class=\"form-inline\">\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xs-12 col-xxs-12 pdd-15-xs-t pdd-15-xxs-t pdd-15-xs-b pdd-15-xxs-b\">\r\n");
      out.write("                      <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                        <h5 class=\"text-gray\">Cliente</h5>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                        <input type=\"text\" name=\"cliente\" class=\"form-control\" required>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                      <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                        <h5 class=\"text-gray\">CNPJ</h5>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                        <input type=\"text\" name=\"cnpj\" class=\"form-control\" required>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                      <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                        <h5 class=\"text-gray\">Representante</h5>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                        <input type=\"text\" name=\"representante\" class=\"form-control\" required>\r\n");
      out.write("                      </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                      <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                        <h5 class=\"text-gray\">E-mail</h5>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                        <input type=\"text\" name=\"E-mail\" class=\"form-control\" required>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                      <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                        <h5 class=\"text-gray\">Telefone</h5>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                        <input type=\"text\" name=\"telefone\" class=\"form-control\" required>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                     <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                      <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                        <h5 class=\"text-gray\">Endereço</h5>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-xs-12 col-xxs-12\">\r\n");
      out.write("                        <input type=\"text\" name=\"endereco\" class=\"form-control\" required>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"row row-card\">\r\n");
      out.write("                    <div class=\"col-xs-12 col-xxs-12  pdd-30-xs-t pdd-30-xxs-t pdd-30-xxs-b pdd-30-xs-b\">\r\n");
      out.write("                      <button id=\"success-create\" type=\"submit\" name=\"acao\" class=\" btn btn-lg btn-primary text-white btn-block botao-cadastrar\">Cadastrar</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core JavaScript -->\r\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"javascripts/bootstrap.min.js\"></script>\r\n");
      out.write("  <script src=\"js/menu-mobile.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    function swalSucess() {\r\n");
      out.write("        swal({\r\n");
      out.write("          title: \"Cliente criado com sucesso!\",\r\n");
      out.write("          icon: \"success\",\r\n");
      out.write("          button: \"OK\",\r\n");
      out.write("        });\r\n");
      out.write("        document.getElementById(\"success-create\")[0].setAttribute(\"value\", \"criar\");\r\n");
      out.write("      }\r\n");
      out.write("    \r\n");
      out.write("     /* value=\"criar\" */\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <!-- Menu Toggle Script -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f0_reused = false;
    try {
      _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f0.setParent(null);
      // /WEB-INF/views/CadastroCliente.jsp(6,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f0.setUrl("Header.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
        if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
      _jspx_th_c_005fimport_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f1_reused = false;
    try {
      _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f1.setParent(null);
      // /WEB-INF/views/CadastroCliente.jsp(15,1) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f1.setUrl("importViews/SidebarAdmin.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f1 = _jspx_th_c_005fimport_005f1.doStartTag();
        if (_jspx_th_c_005fimport_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f1);
      _jspx_th_c_005fimport_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/views/CadastroCliente.jsp(119,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.perfil.nome == 'Administrador'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fimport_005f2(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f2 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f2_reused = false;
    try {
      _jspx_th_c_005fimport_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
      // /WEB-INF/views/CadastroCliente.jsp(120,4) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f2.setUrl("importViews/MenuAdminMobile.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f2 = _jspx_th_c_005fimport_005f2.doStartTag();
        if (_jspx_th_c_005fimport_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f2);
      _jspx_th_c_005fimport_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/views/CadastroCliente.jsp(122,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.perfil.nome == 'Analista'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fimport_005f3(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f3 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f3_reused = false;
    try {
      _jspx_th_c_005fimport_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
      // /WEB-INF/views/CadastroCliente.jsp(123,4) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f3.setUrl("importViews/MenuAnalistaMobile.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f3 = _jspx_th_c_005fimport_005f3.doStartTag();
        if (_jspx_th_c_005fimport_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f3.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f3);
      _jspx_th_c_005fimport_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f3_reused);
    }
    return false;
  }
}
