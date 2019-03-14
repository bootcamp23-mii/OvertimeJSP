package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("    <body class=\"animsition\">\r\n");
      out.write("        <div class=\"page-wrapper\">\r\n");
      out.write("            <!-- HEADER MOBILE-->\r\n");
      out.write("            <header class=\"header-mobile d-block d-lg-none\">\r\n");
      out.write("                <div class=\"header-mobile__bar\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"header-mobile-inner\">\r\n");
      out.write("                            <a class=\"logo\" href=\"index.html\">\r\n");
      out.write("                                <img src=\"images/icon/logo.png\" alt=\"CoolAdmin\" />\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <button class=\"hamburger hamburger--slider\" type=\"button\">\r\n");
      out.write("                                <span class=\"hamburger-box\">\r\n");
      out.write("                                    <span class=\"hamburger-inner\"></span>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbarmobile.jsp", out, false);
      out.write("\r\n");
      out.write("            </header>\r\n");
      out.write("            <!-- END HEADER MOBILE-->\r\n");
      out.write("\r\n");
      out.write("            <!-- MENU SIDEBAR-->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\r\n");
      out.write("            <!-- END MENU SIDEBAR-->\r\n");
      out.write("\r\n");
      out.write("            <!--CUSTOM CONTAINER-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- PAGE CONTAINER-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"page-container\">\r\n");
      out.write("                <!-- HEADER DESKTOP-->\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("                <!-- HEADER DESKTOP-->\r\n");
      out.write("\r\n");
      out.write("                <!-- MAIN CONTENT-->\r\n");
      out.write("                <div class=\"main-content\" id=\"loadthis\">\r\n");
      out.write("                    <h1>DEFAULT LANDING</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- END MAIN CONTENT-->\r\n");
      out.write("\r\n");
      out.write("                <!-- END PAGE CONTAINER-->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Jquery JS-->\r\n");
      out.write("        <script src=\"vendor/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap JS-->\r\n");
      out.write("        <script src=\"vendor/bootstrap-4.1/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"vendor/bootstrap-4.1/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- Vendor JS       -->\r\n");
      out.write("        <script src=\"vendor/slick/slick.min.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"vendor/wow/wow.min.js\"></script>\r\n");
      out.write("        <script src=\"vendor/animsition/animsition.min.js\"></script>\r\n");
      out.write("        <script src=\"vendor/bootstrap-progressbar/bootstrap-progressbar.min.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"vendor/counter-up/jquery.waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"vendor/counter-up/jquery.counterup.min.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"vendor/circle-progress/circle-progress.min.js\"></script>\r\n");
      out.write("        <script src=\"vendor/perfect-scrollbar/perfect-scrollbar.js\"></script>\r\n");
      out.write("        <script src=\"vendor/chartjs/Chart.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"vendor/select2/select2.min.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Main JS-->\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("        <script src=\"js/selfScript.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("<!-- end document-->\r\n");
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
