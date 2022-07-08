package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\">\n");
      out.write("        <title>Registration Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background: #f9ece6;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("            .form-control {\n");
      out.write("                height: 40px;\n");
      out.write("                box-shadow: none;\n");
      out.write("                color: #969fa4;\n");
      out.write("            }\n");
      out.write("            .form-control:focus {\n");
      out.write("                border-color: #5cb85c;\n");
      out.write("            }\n");
      out.write("            .form-control, .btn {        \n");
      out.write("                border-radius: 3px;\n");
      out.write("            }\n");
      out.write("            .signup-form {\n");
      out.write("                width: 450px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 30px 0;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            .signup-form h2 {\n");
      out.write("                color: #f89cab;\n");
      out.write("                margin: 0 0 15px;\n");
      out.write("                position: relative;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .signup-form h2:before, .signup-form h2:after {\n");
      out.write("                content: \"\";\n");
      out.write("                height: 2px;\n");
      out.write("                width: 30%;\n");
      out.write("                background: #d4d4d4;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                z-index: 2;\n");
      out.write("            }\t\n");
      out.write("            .signup-form h2:before {\n");
      out.write("                left: 0;\n");
      out.write("            }\n");
      out.write("            .signup-form h2:after {\n");
      out.write("                right: 0;\n");
      out.write("            }\n");
      out.write("            .signup-form .hint-text {\n");
      out.write("                color: #f89cab;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .signup-form form {\n");
      out.write("                color: #999;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("                background: #f2f3f7;\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            .signup-form .form-group {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("            .signup-form input[type=\"checkbox\"] {\n");
      out.write("                margin-top: 3px;\n");
      out.write("            }\n");
      out.write("            .signup-form .btn {        \n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: bold;\t\t\n");
      out.write("                min-width: 140px;\n");
      out.write("                outline: none !important;\n");
      out.write("            }\n");
      out.write("            .signup-form .row div:first-child {\n");
      out.write("                padding-right: 10px;\n");
      out.write("            }\n");
      out.write("            .signup-form .row div:last-child {\n");
      out.write("                padding-left: 10px;\n");
      out.write("            }    \t\n");
      out.write("            .signup-form a {\n");
      out.write("                color: #f89cab;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            .signup-form a:hover {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .signup-form form a {\n");
      out.write("                color: #f89cab;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\t\n");
      out.write("            .signup-form form a:hover {\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            .btn-success {\n");
      out.write("                color: #fff;\n");
      out.write("                background-color: #f89cab;\n");
      out.write("                border-color: #f89cab;\n");
      out.write("            }\n");
      out.write("            .btn-success:hover {\n");
      out.write("                background-color: #f89cab;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"signup-form\">\n");
      out.write("            <form action=\"/examples/actions/confirmation.php\" method=\"post\">\n");
      out.write("                <h2>Register</h2>\n");
      out.write("                <p class=\"hint-text\">Create your account. It's free and only takes a minute.</p>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"full_name\" placeholder=\"Full Name\" required=\"required\"> \t\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Username\" required=\"required\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"required\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"confirm_password\" placeholder=\"Confirm Password\" required=\"required\">\n");
      out.write("                </div>        \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"form-check-label\"><input type=\"checkbox\" required=\"required\"> I accept the <a href=\"#\">Terms of Use</a> &amp; <a href=\"#\">Privacy Policy</a></label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success btn-lg btn-block\">Register Now</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"text-center\">Already have an account? <a href=\"login.jsp\">Sign in</a></div>\n");
      out.write("        </div>\n");
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
