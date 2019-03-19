<%-- 
    Document   : adminUserAccess
    Created on : Mar 19, 2019, 9:21:43 AM
    Author     : milhamafemi
--%>

<%@page import="java.util.List"%>
<%@page import="models.Employee"%>
<%@page import="models.Job"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%boolean cekData = session.getAttribute("dataEmp") != null;
        Employee emp = (cekData) ? (Employee) session.getAttribute("empIdAccess") : null;
        boolean cekList = session.getAttribute("dataEmp") != null;
        if (!cekList) {
            response.sendRedirect("./AdminServlet");
        }
    %>
    <div class="section__content section__content--p30">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <div class="overview-wrap">
                        <h2 class="title-1">User Access</h2>
                    </div>
                </div>
            </div>
<!--            <div class="row m-t-25">
            </div>-->
            <div class="row">
                <div class="col-lg-12">
                    <div class="au-card recent-report">
                        <div class="au-card-inner">

                            <div class="col-lg-12">
                                <div class="table-responsive table--no-card m-b-30">
                                    <!--TABLE HERE-->
                                    <table id="userAccessTable" class="table table-borderless table-striped table-earning" cellspacing='30' align ='center'>
                                        <thead>
                                            <tr>
                                                <th>No.</th>
                                                <th>Id</th>
                                                <th>Name</th>
                                                <th>Job</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <% int i = 1;
                                                if (cekList) {
                                                    for (Employee elem : (List<Employee>) session.getAttribute("dataEmp")) {%>
                                            <tr>
                                                <td><%= i++%></td>
                                                <td><%= elem.getId()%></td>
                                                <td><%= elem.getName()%></td>
                                                <td><%= elem.getJob().getPosition()%></td>
                                            </tr>
                                            <%}
                                                } else {
                                                    response.sendRedirect("./AdminServlet");
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
