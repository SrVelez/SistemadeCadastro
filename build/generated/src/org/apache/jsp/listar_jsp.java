package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.com.controle.Aluno;
import br.com.modelo.ManterAluno;

public final class listar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <!-- Linha para utilizar o bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Linha para utilizar o JavaScript -->\n");
      out.write("       <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" crossorigin=\"anonymous\"></script>\n");
      out.write("       \n");
      out.write("        </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Meta tags Obrigatórias -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <title></title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("   <div class=\"alert alert-primary\" role=\"alert\">\n");
      out.write("       <a href=\"index.jsp\">Home</a>\n");
      out.write("       <a href=\"formulario.jsp\">Cadastro</a>\n");
      out.write("       <a href=\"listar.jsp\">Listar</a>\n");
      out.write("   </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("    <!-- JavaScript (Opcional) -->\n");
      out.write("    <!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("        <table class=\"table table-striped\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">Codigo</th>\n");
      out.write("      <th scope=\"col\">Nome</th>\n");
      out.write("      <th scope=\"col\">E-mail</th>\n");
      out.write("      <th scope=\"col\"></th>\n");
      out.write("      <th scope=\"col\"></th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("        ");

          String vcodigo="";
          String vnome="";
          String vemail="";
          String vcontador="";
          //String ac = (String) request.getAttribute("relatorio");
         
           ManterAluno dao = new ManterAluno();
           Aluno al = new Aluno();
             ArrayList<Aluno> nt = dao.pesquisarTudo();  
             
            for (int i = 0; i < nt.size(); i++) {                
                al = nt.get(i);
              vcodigo= String.valueOf(al.getCodigo());
              vnome = String.valueOf(al.getNome());
              vemail = String.valueOf(al.getEmail());
             
               
      out.write("\n");
      out.write("              \n");
      out.write("            <tr>\n");
      out.write("              <th scope=\"row\">");
      out.print(vcodigo);
      out.write("</th>\n");
      out.write("              <td>");
      out.print(vnome);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(vemail);
      out.write("</td>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("              <td><a href=\"editar?codigo=");
      out.print(vcodigo);
      out.write("\" >Alterar</a></td>\n");
      out.write("              <td>\n");
      out.write("                   <a href=\"del?codigo=");
      out.print(vcodigo);
      out.write("\" onclick=\"return confirm('Confirma exclusão do registro ");
      out.print(vnome);
      out.write("?')\">excluir </a>   \n");
      out.write("                 \n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("          \n");
      out.write("            ");
} 
        
      out.write("\n");
      out.write("         \n");
      out.write("        </table>\n");
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
