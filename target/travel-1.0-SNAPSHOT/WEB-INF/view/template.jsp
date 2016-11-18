<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html" pageEncoding="UTF8"%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Limitless - Responsive Web Application Kit by Eugene Kopyov</title>


    <!-- Global stylesheets -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900" rel="stylesheet" type="text/css">
    <link href="resources/css/icons/icomoon/styles.css" rel="stylesheet" type="text/css">
    <link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="resources/css/core.css" rel="stylesheet" type="text/css">
    <link href="resources/css/components.css" rel="stylesheet" type="text/css">
    <link href="resources/css/colors.css" rel="stylesheet" type="text/css">

    <!-- /global stylesheets -->


    <!-- Core JS files -->
    <script type="text/javascript" src="resources/js/plugins/loaders/pace.min.js"></script>
    <script type="text/javascript" src="resources/js/core/libraries/jquery.min.js"></script>
    <script type="text/javascript" src="resources/js/core/libraries/bootstrap.min.js"></script>
    <script type="text/javascript" src="resources/js/plugins/loaders/blockui.min.js"></script>
    <!-- /core JS files -->


</head>

<body>

<!-- Main navbar -->
<tiles:insertAttribute name="header"/>
<!-- /main navbar -->


<!-- Page container -->
<div class="page-container">

    <!-- Page content -->
    <div class="page-content">

        <!-- Main sidebar -->
        <tiles:insertAttribute name="menu"/>
        <!-- /main sidebar -->


        <!-- Main content -->
        <div class="content-wrapper">

            <!-- Content area -->
            <div class="content">

                <tiles:insertAttribute name="content"/>

                <!-- Footer -->
                <tiles:insertAttribute name="footer"/>
                <!-- /footer -->

            </div>
            <!-- /content area -->

        </div>
        <!-- /main content -->

    </div>
    <!-- /page content -->

</div>
<!-- /page container -->




<!-- Theme JS files -->
<%--<tiles:insertAttribute name="javascript"/>--%>
<!-- /theme JS files -->




</body>
</html>
