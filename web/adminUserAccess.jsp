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
        Employee emp = (cekData) ? (Employee) session.getAttribute("UAid") : null;
        boolean cekList = session.getAttribute("dataEmp") != null;
        if (!cekList) {
            response.sendRedirect("./AdminServlet");
        }
    %>
    <form action="AdminServlet" method="POST">
        <div class="modal fade" id="modalUserAccess" tabindex="-1" 
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
                        <div class="md-form mb-2">
                            <label data-error="wrong" data-success="true" class="label">ID</label>
                            <input type="text" id="UAid" name="UAid" disabled class="form-control" value=<%= (session.getAttribute("UAid") != null) ? session.getAttribute("UAid") : ""%>>
                        </div>
                        <div class="md-form mb-2">
                            <label data-error="wrong" data-success="true" class="label">Name</label>
                            <input type="text" id="UAname" name="UAname" disabled class="form-control" value=<%= (session.getAttribute("UAname") != null) ? session.getAttribute("UAname") : ""%>>
                        </div>
                        <div class="md-form mb-2">
                            <label data-error="wrong" data-success="true" class="label">Address</label>
                            <input type="text" id="UAaddress" name="UAaddress" disabled class="form-control" value=<%= (session.getAttribute("UAaddress") != null) ? session.getAttribute("UAaddress") : ""%>>
                        </div>
                        <div class="md-form mb-2">
                            <label data-error="wrong" data-success="true" class="label">Salary</label>
                            <input type="text" id="UAsalary" name="UAsalary" disabled class="form-control" value=<%= (session.getAttribute("UAsalary") != null) ? session.getAttribute("UAsalary") : ""%>>
                        </div>
                        <div class="md-form mb-2">
                            <label data-error="wrong" data-success="true" class="label">Email</label>
                            <input type="text" id="UAemail" name="UAemail" disabled class="form-control" value=<%= (session.getAttribute("UAemail") != null) ? session.getAttribute("UAemail") : ""%>>
                        </div>
                        <div class="md-form mb-2">
                            <label data-error="wrong" data-success="true" class="label">Password</label>
                            <input type="password" id="UApassword" disabled name="UApassword" class="form-control" value=<%= (session.getAttribute("UApassword") != null) ? session.getAttribute("UApassword") : ""%>>
                        </div>
                        <div class="md-form mb-2">
                            <label data-error="wrong" data-success="true" class="label">Name</label>
                            <input type="text" id="UAdivison" name="UAdivison" disabled class="form-control" value=<%= (session.getAttribute("UAdivison") != null) ? session.getAttribute("UAdivison") : ""%>>
                        </div>
                        <div class="md-form mb-2">
                            <label data-error="wrong" data-success="true" class="label">Name</label>
                            <input type="text" id="UAsite" name="UAsite" disabled class="form-control" value=<%= (session.getAttribute("UAsite") != null) ? session.getAttribute("UAsite") : ""%>>
                        </div>
                        <div class="md-form mb-2">
                            <label data-error="wrong" data-success="true" class="label">Name</label>
                            <input type="text" id="UAmanager" name="UAmanager" class="form-control" disabled value=<%= (session.getAttribute("UAmanager") != null) ? session.getAttribute("UAmanager") : ""%> >
                        </div>
                        <div class="md-form mb-2"
                            <label data-error="wrong" data-success="true" class="">Job</label>
                            <div>
                                <select class="custom-select" name="UAjob" id="UAjob" ><% for (Job elem : (List<Job>) session.getAttribute("dataJob")) {
                                        out.print("<option "
                                                + "value=\"" + elem.getId() + "\" "
                                                + (elem.getId().equals(session.getAttribute("UAjob")) ? "selected" : "") + ">"
                                                + elem.getPosition()
                                                + "</option>");
                                    }
                                    %></select>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-primary" type="submit" value="updateJob" name="buttonAction" >SAVE CHANGE</button>
                    </div>
                </div>
            </div>
        </div>
    </form>
    <div class="section__content section__content--p30">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                </div>
            </div>
            <div class="row m-t-25">
            </div>
            <!--            <div class="row m-t-25">
                        </div>-->
            <div class="row">
                <div class="col-lg-12">
                    <div class="au-card recent-report">
                        <div class="au-card-inner">
                            <h3 class="title-10" >User Access</h3>
                            <div class="row m-t-25">
                            </div>
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
                                                <th>Edit</th>
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
                                                <td>
                                                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalUserAccess" 
                                                            data-ugetid="<%= elem.getId()%>" 
                                                            data-ugetname="<%= elem.getName()%>" 
                                                            data-ugetaddress="<%= elem.getAddress()%>" 
                                                            data-ugetsalary="<%= elem.getSalary()%>" 
                                                            data-ugetemail="<%= elem.getEmail()%>" 
                                                            data-ugetpassword="<%= elem.getPassword()%>" 
                                                            data-ugetdivision="<%= elem.getDivision().getId() %>" 
                                                            data-ugetsite="<%= elem.getSite().getId() %>" 
                                                            data-ugetmanager="<%= elem.getManager().getId() %>" 
                                                            data-ugetjob="<%= elem.getJob().getId()%>" 
                                                            ><i class="fas fa-edit"></i></button>
                                                </td>
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
    <script>
        $('#modalUserAccess').on('show.bs.modal', function (event) {
            var button = $(event.relatedTarget)
            var id = button.data('ugetid')
            var name = button.data('ugetname')
            var address = button.data('ugetaddress')
            var salary = button.data('ugetsalary')
            var email = button.data('ugetemail')
            var password = button.data('ugetpassword')
            var division = button.data('ugetdivision')
            var site = button.data('ugetsite')
            var manager = button.data('ugetmanager')
            var job = button.data('ugetjob')

            var modal = $(this)
            modal.find('#UAid').val(id)
            modal.find('#UAname').val(name)
            modal.find('#UAaddress').val(address)
            modal.find('#UAsalary').val(salary)
            modal.find('#UAemail').val(email)
            modal.find('#UApassword').val(password)
            modal.find('#UAdivison').val(division)
            modal.find('#UAsite').val(site)
            modal.find('#UAmanager').val(manager)
            modal.find('#UAjob').val(job)
        })
    </script>
</html>
