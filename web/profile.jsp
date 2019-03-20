<%-- 
    Document   : content
    Created on : 14-Mar-2019, 09:41:08
    Author     : Pandu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div class="section__content section__content--p30">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                </div>
            </div>
            <div class="row m-t-25">
            </div>
            <form action="mail" method="post">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="row m-t-45">
                        </div>
                        <div class="au-card recent-report">

                            <div class="au-card-inner">
                                <div>
                                    <h3 class="h1">PROFILE</h3>
                                </div>
                                <div class="row form-group">
                                    <div class="col col-md-3">
                                        <label data-error="wrong" data-success="true" class="">Your Name </label>
                                    </div>
                                    <div class="col-12 col-md-9">
                                        <label name="subject"> :    <%= (session.getAttribute("empname") != null) ? session.getAttribute("empname") : ""%></label>
                                    </div>
                                </div>
                                <div class="row form-group">
                                    <div class="col col-md-3">
                                        <label data-error="wrong" data-success="true" class="">Your ID </label>
                                    </div>
                                    <div class="col-12 col-md-9">
                                        <label name="subject"> :    <%= (session.getAttribute("empid") != null) ? session.getAttribute("empid") : ""%></label>
                                    </div>
                                </div>
                                <div class="row form-group">
                                    <div class="col col-md-3">
                                        <label data-error="wrong" data-success="true" class="">Your Email </label>
                                    </div>
                                    <div class="col-12 col-md-9">
                                        <label name="subject"> :    <%= (session.getAttribute("empemail") != null) ? session.getAttribute("empemail") : ""%></label>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>

</html>