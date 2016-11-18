<%--
  Created by IntelliJ IDEA.
  User: lequan
  Date: 11/11/2016
  Time: 10:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="sidebar sidebar-main">
    <div class="sidebar-content">

        <!-- User menu -->
        <div class="sidebar-user">
            <div class="category-content">
                <div class="media">
                    <a href="#" class="media-left"><img src="resources/images/placeholder.jpg" class="img-circle img-sm"
                                                        alt=""></a>
                    <div class="media-body">
                        <span class="media-heading text-semibold">Victoria Baker</span>
                        <div class="text-size-mini text-muted">
                            <i class="icon-pin text-size-small"></i> &nbsp;Santa Ana, CA
                        </div>
                    </div>

                    <div class="media-right media-middle">
                        <ul class="icons-list">
                            <li>
                                <a href="#"><i class="icon-cog3"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!-- /user menu -->


        <!-- Main navigation -->
        <div class="sidebar-category sidebar-category-visible">
            <div class="category-content no-padding">
                <ul class="navigation navigation-main navigation-accordion">

                    <li class="navigation-header"><span>Data</span> <i class="icon-menu" title="Main pages"></i></li>
                    <li>
                        <a href="/country">
                            <i class="icon-list-unordered"></i>
                            <span>Country</span>
                        </a>
                    </li>

                    <li>
                        <a href="/city">
                            <i class="icon-list-unordered"></i>
                            <span>City</span>
                        </a>
                    </li>
                    <li>
                        <a href="#"><i class="icon-stack2"></i> <span>Restaurant</span></a>
                        <ul>
                            <li><a href="restaurant/list.jsp">List</a></li>
                            <li><a href="restaurant/form.jsp">Add new</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="icon-stack2"></i> <span>Hotel</span></a>
                        <ul>
                            <li><a href="hotel/list.jsp">List</a></li>
                            <li><a href="hotel/form.jsp">Add new</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="icon-stack2"></i> <span>Place</span></a>
                        <ul>
                            <li><a href="place/list.jsp">List</a></li>
                            <li><a href="place/form.jsp">Add new</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
        <!-- /main navigation -->

    </div>
</div>
