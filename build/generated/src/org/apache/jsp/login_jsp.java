package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Login Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background: #f9ece6;\n");
      out.write("            }\n");
      out.write("            .login-form {\n");
      out.write("                width: 340px;\n");
      out.write("                margin: 50px auto;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            .login-form form {\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("                background: #f7f7f7;\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            .login-form h2 {\n");
      out.write("                margin: 0 0 15px;\n");
      out.write("            }\n");
      out.write("            .form-control, .btn {\n");
      out.write("                min-height: 38px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("            }\n");
      out.write("            .btn {        \n");
      out.write("                font-size: 15px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .btn-primary {\n");
      out.write("                color: #fff;\n");
      out.write("                background-color: #f89cab;\n");
      out.write("                border-color: #f89cab;\n");
      out.write("            }\n");
      out.write("            .float-right {\n");
      out.write("                float: right!important;\n");
      out.write("                color: #f89cab;\n");
      out.write("            }\n");
      out.write("            .text-center {\n");
      out.write("                text-align: center!important;\n");
      out.write("                color: #f89cab;\n");
      out.write("            }\n");
      out.write("            .text-center a{\n");
      out.write("                color: #f89cab;\n");
      out.write("            }\n");
      out.write("            .float-right:hover {\n");
      out.write("                color: #f89cab;\n");
      out.write("            }\n");
      out.write("            .btn-primary:hover {\n");
      out.write("                background-color: #f89cab;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-form\">\n");
      out.write("            <form action=\"/examples/actions/confirmation.php\" method=\"post\">\n");
      out.write("                <h2 class=\"text-center\">Log in</h2>       \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Username\" required=\"required\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-control\" placeholder=\"Password\" required=\"required\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-block\">Log in</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\">\n");
      out.write("                    <label class=\"float-left form-check-label\"><input type=\"checkbox\"> Remember me</label>\n");
      out.write("                    <a href=\"#\" class=\"float-right\" color=\"#f89cab\">Forgot Password?</a>\n");
      out.write("                </div>        \n");
      out.write("            </form>\n");
      out.write("            <p class=\"text-center\"><a href=\"#\">Create an Account</a></p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
