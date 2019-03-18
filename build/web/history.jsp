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

    <%boolean cekData = session.getAttribute("history") != null;
        Overtime ov = (cekData) ? (Overtime) session.getAttribute("overtime") : null;
        boolean cekList = session.getAttribute("history") != null;
        if (!cekList) {
            response.sendRedirect("./HistoryServlet");
        }
    %>


    <div class="section__content section__content--p30">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <div class="overview-wrap">
                        <h2 class="title-1">ALL HISTORY</h2>
                    </div>
                </div>
            </div>
            <div class="row m-t-25">
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="au-card recent-report">
                        <div class="au-card-inner">
                            <!--                            <h3 class="title-2">ALL HISTORY</h3>
                                                        <div class="row m-t-25">
                                                        </div>-->
                            <div class="col-lg-12">
                                <div class="table-responsive table--no-card m-b-30">
                                    <!--TABLE HERE-->

                                    <table id="historyTable" class="table table-borderless table-striped table-earning" cellspacing='30' align ='center'>
                                        <thead>
                                            <tr>
                                                <th>No.</th>
                                                <th>Id</th>
                                                <th>Date</th>
                                                <th>Duration</th>
                                                <th>Keterangan</th>
                                                <th>Time Sheet</th>
                                                <th>Status</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <% int i = 1;
                                                if (cekList) {
                                                    for (Overtime elem : (List<Overtime>) session.getAttribute("history")) {%>
                                            <tr>
                                                <td><%= i++%></td>
                                                <td><%= elem.getId()%></td>
                                                <td><%= elem.getDate()%></td>
                                                <td><%= elem.getTimeduration()%></td>
                                                <td><%= elem.getKeterangan()%></td>
                                                <td><%= elem.getTimesheet().getId()%></td>
                                                <td><%= elem.getStatus().getStatus()%></td>
                                            </tr>
                                            <%}
                                                } else {
                                                    response.sendRedirect("./HistoryServlet");
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
</html>
