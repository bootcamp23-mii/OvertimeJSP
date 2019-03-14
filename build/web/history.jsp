<%-- 
    Document   : history
    Created on : 14-Mar-2019, 15:54:08
    Author     : Pandu
--%>

<%@page import="java.util.List"%>
<%@page import="models.Overtime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <%boolean cekData = session.getAttribute("data") != null;
        Overtime ov = (cekData) ? (Overtime) session.getAttribute("overtime") : null;
        boolean cekList = session.getAttribute("data") != null;
        if (!cekList) {
            response.sendRedirect("./HistoryServlet");
        }
    %>

    <form action="HistoryServlet" method="POST">
        <div class="modal fade" id="modalOvertime" tabindex="-1" 
             role="dialog" aria-labeledby="myModalHeader" aris-hidden="true">
            <div class="modal-dialog" role="document" >
                <div class="modal-content">
                    <div class="modal-header text-center">
                        <h3 class="modal-title">EDITOR</h3>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="md-form mb-5">
                            <label data-error="wrong" data-success="true" class="">ID</label>
                            <input type="text" id="otId" class="form-control" value=<%= (session.getAttribute("otId") != null) ? session.getAttribute("otId") : ""%>>
                        </div>
                        <div class="md-form mb-5">
                            <label data-error="wrong" data-success="true" class="">Nama</label>
                            <input type="text" id="timesheet" class="form-control" value=<%= (session.getAttribute("timesheet") != null) ? session.getAttribute("timesheet") : ""%>>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <input type="submit" value="Save" name="save" />
                    </div>
                </div>
            </div>
        </div>
    </form>
    <div class="section__content section__content--p30">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <div class="overview-wrap">
                        <h2 class="title-1">SHOW DATA</h2>
                    </div>
                </div>
            </div>
            <div class="row m-t-25">
            </div>
            <div class="row">
                <div class="col-lg-10">
                    <div class="au-card recent-report">
                        <div class="au-card-inner">
                            <h3 class="title-2">ALL HISTORY</h3>
                            <div class="chart-info">
                                <div class="chart-info">
                                    <!--TABLE HERE-->
                                    <table id="historyTable" class="table table-striped" cellspacing='30' align ='center'>
                                        <thead>
                                            <tr>
                                                <th>No.</th>
                                                <th>Id</th>
                                                <th>Date</th>
                                                <th>Duration</th>
                                                <th>Keterangan</th>
                                                <th>Time Sheet</th>
                                                <th>Status</th>
                                                <th>Aksi</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <% int i = 1;
                                                if (cekList) {
                                                    for (Overtime elem : (List<Overtime>) session.getAttribute("data")) {%>
                                            <tr>
                                                <td><%= i++%></td>
                                                <td><%= elem.getId()%></td>
                                                <td><%= elem.getDate()%></td>
                                                <td><%= elem.getTimeduration()%></td>
                                                <td><%= elem.getKeterangan()%></td>
                                                <td><%= elem.getTimesheet().getId()%></td>
                                                <td><%= elem.getStatus().getId()%></td>
                                                <td>
                                                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalOvertime" 
                                                            data-getid="<%= elem.getId()%>" data-getts="<%= elem.getTimesheet().getId()%>">Edit</button>
                                                    <button type="button" class="btn btn-danger" href="HistoryServlet?action=delete&id=<%= elem.getId()%>">Hapus</button>
                                                </td>
                                            </tr>
                                            <%}
                                                }%>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script>
        $('#modalOvertime').on('show.bs.modal', function (event) {
            var button = $(event.relatedTarget)
            var id = button.data('getid')
            var ts = button.data('getts')

            var modal = $(this)
            modal.find('#otId').val(id)
            modal.find('#timesheet').val(ts)
        })
    </script>

</html>
