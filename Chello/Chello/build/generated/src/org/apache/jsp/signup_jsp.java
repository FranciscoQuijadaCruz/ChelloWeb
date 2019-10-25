package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    HttpSession sesion = request.getSession();
    
    if (sesion.getAttribute("usuario") != null) {
        response.sendRedirect("boards");
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Registrar usuario</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"img/sig.jpg\">\n");
      out.write("              \n");
      out.write("        <form method=\"POST\" action=\"jsp/registrar.jsp\" style=\" background-color: #ffffff; align-content:center; margin: 5%; margin-left: 33%; margin-right: 33%; font-family: calibri; box-shadow: 0 1px 3px 0 rgba(0, 0, 0, 0.15); padding: 40px 40px; border: none; border-radius: 2px;\">\n");
      out.write("            \n");
      out.write("            <h1 style=\"font-weight: bold; font-size: 33px; text-align: center;\">Crear cuenta</h1>\n");
      out.write("            <h4 style=\"text-align: center\">o inicie sesión <a href=\"login.jsp\">aqui</a></h4>\n");
      out.write("            <br>\n");
      out.write("     \n");
      out.write("               \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"name\">Nombre</label>\n");
      out.write("                    <input type=\"text\" id=\"name\" name=\"name\"  class=\"form-control\" id=\"name2\" placeholder=\"P ej: Francisco Quijada\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"lastname\">Correo Electrónico</label>\n");
      out.write("                    <input type=\"email\" id=\"email\" name=\"email\" class=\"form-control\" placeholder=\"P ej: fran@gmail.com\">\n");
      out.write("                </div>\n");
      out.write("                      \n");
      out.write("                \n");
      out.write("                <div class=\"form-group\" >\n");
      out.write("                    <label for=\"password\">Contraseña</label>\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\" id=\"id2\" placeholder=\"P ej: *********\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" >\n");
      out.write("                    <label for=\"butonr\">¿Esta seguro?</label>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success form-control\" >Crear cuenta de Chello</button> \n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("                \n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
