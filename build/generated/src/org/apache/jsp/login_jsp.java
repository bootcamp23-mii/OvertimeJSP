package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Overtime;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

    boolean cekLog = session.getAttribute("login") != null;
    if (cekLog) {
        response.sendRedirect("/OvertimeJSP/index.jsp");
    }

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("    <div class=\"page-wrapper\">\r\n");
      out.write("        <div class=\"page-content--bge5\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"login-wrap\">\r\n");
      out.write("                    <div class=\"login-content\">\r\n");
      out.write("                        <div class=\"login-logo\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <img src=\"images/icon/home.png\" alt=\"CoolAdmin\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"login-form\">\r\n");
      out.write("                            <form action=\"LoginServlet\" method=\"post\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>ID Employee</label>\r\n");
      out.write("                                    <input class=\"au-input au-input--full\" type=\"text\" name=\"usernameLogin\" placeholder=\"Input ID Employee\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Password</label>\r\n");
      out.write("                                    <input class=\"au-input au-input--full\" type=\"password\" name=\"passwordLogin\" placeholder=\"Password\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"login-checkbox\">\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <a href=\"#\">Forgotten Password?</a>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"au-btn au-btn--block au-btn--green m-b-20\" type=\"submit\">sign in</button>\r\n");
      out.write("\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <div class=\"register-link\">\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    Don't you have account?\r\n");
      out.write("                                    <a href=\"#\">Sign Up Here</a>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</html>\r\n");
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
