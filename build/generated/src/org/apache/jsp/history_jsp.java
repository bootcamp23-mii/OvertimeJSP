package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import models.Overtime;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    ");
boolean cekData = session.getAttribute("data") != null;
        Overtime ov = (cekData) ? (Overtime) session.getAttribute("overtime") : null;
        boolean cekList = session.getAttribute("data") != null;
        if (!cekList) {
            response.sendRedirect("./HistoryServlet");
        }
    
      out.write("\n");
      out.write("\n");
      out.write("    <form action=\"HistoryServlet\" method=\"POST\">\n");
      out.write("        <div class=\"modal fade\" id=\"modalOvertime\" tabindex=\"-1\" \n");
      out.write("             role=\"dialog\" aria-labeledby=\"myModalHeader\" aris-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\" >\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header text-center\">\n");
      out.write("                        <h3 class=\"modal-title\">EDITOR</h3>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"md-form mb-2\">\n");
      out.write("                            <label data-error=\"wrong\" data-success=\"true\" class=\"\">ID</label>\n");
      out.write("                            <input type=\"text\" id=\"otId\" class=\"form-control\" value=");
      out.print( (session.getAttribute("otId") != null) ? session.getAttribute("otId") : "");
      out.write(">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"md-form mb-2\">\n");
      out.write("                            <label data-error=\"wrong\" data-success=\"true\" class=\"\">Nama</label>\n");
      out.write("                            <input type=\"text\" id=\"timesheet\" class=\"form-control\" value=");
      out.print( (session.getAttribute("timesheet") != null) ? session.getAttribute("timesheet") : "");
      out.write(">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <input type=\"submit\" value=\"Save\" name=\"save\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    <div class=\"section__content section__content--p30\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"overview-wrap\">\n");
      out.write("                        <h2 class=\"title-1\">SHOW DATA</h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row m-t-25\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"au-card recent-report\">\n");
      out.write("                        <div class=\"au-card-inner\">\n");
      out.write("                            <h3 class=\"title-2\">ALL HISTORY</h3>\n");
      out.write("                            <div class=\"row m-t-25\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <div class=\"table-responsive table--no-card m-b-30\">\n");
      out.write("                                    <!--TABLE HERE-->\n");
      out.write("\n");
      out.write("                                    <table id=\"historyTable\" class=\"table table-borderless table-striped table-earning\" cellspacing='30' align ='center'>\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>No.</th>\n");
      out.write("                                                <th>Id</th>\n");
      out.write("                                                <th>Date</th>\n");
      out.write("                                                <th>Duration</th>\n");
      out.write("                                                <th>Keterangan</th>\n");
      out.write("                                                <th>Time Sheet</th>\n");
      out.write("                                                <th>Status</th>\n");
      out.write("                                                <th>Aksi</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");
 int i = 1;
                                                if (cekList) {
                                                    for (Overtime elem : (List<Overtime>) session.getAttribute("data")) {
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>");
      out.print( i++);
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( elem.getId());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( elem.getDate());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( elem.getTimeduration());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( elem.getKeterangan());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( elem.getTimesheet().getId());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( elem.getStatus().getId());
      out.write("</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modalOvertime\" \n");
      out.write("                                                            data-getid=\"");
      out.print( elem.getId());
      out.write("\" \n");
      out.write("                                                            data-getdate=\"");
      out.print( elem.getDate());
      out.write("\" \n");
      out.write("                                                            data-getduration=\"");
      out.print( elem.getTimeduration());
      out.write("\" \n");
      out.write("                                                            data-getdescription=\"");
      out.print( elem.getKeterangan());
      out.write("\" \n");
      out.write("                                                            data-getts=\"");
      out.print( elem.getTimesheet().getId());
      out.write("\"\n");
      out.write("                                                            data-getstatus=\"");
      out.print( elem.getStatus().getId());
      out.write("\" \n");
      out.write("                                                            >Edit</button>\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-danger\" href=\"HistoryServlet?action=delete&id=");
      out.print( elem.getId());
      out.write("\">Hapus</button>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");
}
                                                }
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        $('#modalOvertime').on('show.bs.modal', function (event) {\n");
      out.write("            var button = $(event.relatedTarget)\n");
      out.write("            var id = button.data('getid')\n");
      out.write("            var date = button.data('getdate')\n");
      out.write("            var duration = button.data('getduration')\n");
      out.write("            var description = button.data('getdescription')\n");
      out.write("            var ts = button.data('getts')\n");
      out.write("            var status = button.data('getstatus')\n");
      out.write("\n");
      out.write("            var modal = $(this)\n");
      out.write("            modal.find('#otId').val(id)\n");
      out.write("            modal.find('#timesheet').val(ts)\n");
      out.write("            modal.find('#timesheet').val(ts)\n");
      out.write("            modal.find('#timesheet').val(ts)\n");
      out.write("            modal.find('#timesheet').val(ts)\n");
      out.write("            modal.find('#timesheet').val(ts)\n");
      out.write("            modal.find('#timesheet').val(ts)\n");
      out.write("        })\n");
      out.write("    </script>\n");
      out.write("\n");
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
