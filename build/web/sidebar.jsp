<%-- 
    Document   : sidebar
    Created on : 14-Mar-2019, 09:40:31
    Author     : Pandu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <aside class="menu-sidebar d-none d-lg-block">
        <div class="logo">
            <a href="#">
                <img src="images/icon/home.png" alt="Cool Admin" />
            </a>
        </div>
        <div class="menu-sidebar__content js-scrollbar1">
            <nav class="navbar-sidebar">
                <ul class="list-unstyled navbar__list">

                    <li class="active has-sub">
                        <a class="js-arrow" href="/content/index.html">
                            <i class="fas fa-home"></i>Dashboard</a>
                    </li>
                    <li>
                        <a href="/content/table.html">
                            <i class="fas fa-tachometer-alt"></i>All Record</a>
                    </li>
                    <li>
                        <a href="#">
                            <i class="fas fa-calendar-alt"></i>Calendar</a>
                    </li>
                    <li>
                        <a href="/content/map.html">
                            <i class="fas fa-user-circle"></i>PROFILE</a>
                    </li>
                    <li class="has-sub">
                        <a class="js-arrow" href="#">
                            <i class="fas fa-history"></i>VIEW</a>
                        <ul class="list-unstyled navbar__sub-list js-sub-list">
                            <li>
                                <a href="#">HISTORY</a>
                            </li>
                            <li>
                                <a href="#">STATUS</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </aside>
</html>
