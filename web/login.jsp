<%-- 
    Document   : login
    Created on : 14-Mar-2019, 14:19:15
    Author     : Pandu
--%>

<%@page import="models.Overtime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <jsp:include page="head.jsp"/>
    <div class="page-wrapper">
        <div class="page-content--bge5">
            <div class="container">
                <div class="login-wrap">
                    <div class="login-content">
                        <div class="login-logo">
                            <a href="#">
                                <img src="images/icon/home.png" alt="CoolAdmin">
                            </a>
                        </div>
                        <div class="login-form">
                            <form action="LoginServlet" method="post">
                                <div class="form-group">
                                    <label>ID Employee</label>
                                    <input class="au-input au-input--full" type="text" name="usernameLogin" placeholder="Input ID Employee">
                                </div>
                                <div class="form-group">
                                    <label>Password</label>
                                    <input class="au-input au-input--full" type="password" name="passwordLogin" placeholder="Password">
                                </div>
                                <div class="login-checkbox">
                                    <label>
                                        <a href="#">Forgotten Password?</a>
                                    </label>
                                </div>
                                <button class="au-btn au-btn--block au-btn--green m-b-20" type="submit">sign in</button>

                            </form>
                            <div class="register-link">
                                <p>
                                    Don't you have account?
                                    <a href="#">Sign Up Here</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <% session.removeAttribute("login"); %>
        <% session.removeAttribute("otId"); %>
        <% session.removeAttribute("otDate"); %>
        <% session.removeAttribute("otDuration"); %>
        <% session.removeAttribute("otDesc"); %>
        <% session.removeAttribute("otStatus"); %>
        <% session.removeAttribute("timesheet"); %>
        <% session.removeAttribute("data"); %>
        <% session.removeAttribute("role"); %>
        <% session.removeAttribute("history"); %>
        <% session.removeAttribute("all");%>
</html>
