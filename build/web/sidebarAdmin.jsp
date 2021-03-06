<%-- 
    Document   : sidebarAdmin
    Created on : Mar 17, 2019, 2:09:54 PM
    Author     : milhamafemi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <<aside class="menu-sidebar d-none d-lg-block">
        <div class="logo">
            <a href="#">
                <img src="images/icon/home.png" alt="Cool Admin" />
            </a>
        </div>
        <div class="menu-sidebar__content js-scrollbar1">
            <nav class="navbar-sidebar">
                <ul class="list-unstyled navbar__list">

                    <!--IF POSIBLE, USE THE ACTIVE/INACTIVE STATUS TO NAVBAR BELOW-->

                    <li class="">
                        <a id="nav_home" class="js-arrow" href="#">
                            <i class="fas fa-home"></i>Dashboard</a>
                    </li>
                    <li>
                        <a href="#" id="nav_all">
                            <i class="fas fa-chart-bar"></i>All Record</a>
                    </li>
                    <li>
                        <a href="#" id="nav_add_emp">
                            <i class="fas fa-user-plus"></i>Create User</a>
                    </li>
                    <li>
                        <a href="#" id="nav_user_access">
                            <i class="fas           fa-user-secret"></i>User Access</a>
                    </li>
                    <li>
                        <a href="#" id="nav_add">
                            <i class="fas fa-plus-square"></i>Add Request</a>
                    </li>
                    <li class="has-sub">
                        <a class="js-arrow" href="#">
                            <i class="fas fa-history"></i>View</a>
                        <ul class="list-unstyled navbar__sub-list js-sub-list">
                            <li>
                                <a href="#" id="nav_history">
                                    <i class="fas fa-history"></i>All History</a>
                            </li>
                            <li>
                                <a href="#" id="nav_status">
                                    <i class="fas fa-exclamation"></i>All Status</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </aside>
</html>