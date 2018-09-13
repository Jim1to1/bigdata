<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Required Stylesheets -->
<link rel="stylesheet" type="text/css" href="<%=path%>/css/reset.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/text.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/fonts/ptsans/stylesheet.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/fluid.css" media="screen"/>

<link rel="stylesheet" type="text/css" href="<%=path%>/css/mws.style.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/icons/icons.css" media="screen"/>

<!-- Demo and Plugin Stylesheets -->
<link rel="stylesheet" type="text/css" href="<%=path%>/css/demo.css" media="screen"/>

<link rel="stylesheet" type="text/css" href="<%=path%>/plugins/colorpicker/colorpicker.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/plugins/jimgareaselect/css/imgareaselect-default.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/plugins/fullcalendar/fullcalendar.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/plugins/fullcalendar/fullcalendar.print.css" media="print"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/plugins/tipsy/tipsy.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/plugins/sourcerer/Sourcerer-1.2.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/plugins/jgrowl/jquery.jgrowl.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/plugins/spinner/spinner.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/jui/jquery.ui.css" media="screen"/>

<!-- Theme Stylesheet -->
<link rel="stylesheet" type="text/css" href="<%=path%>/css/mws.theme.css" media="screen"/>

<!-- JavaScript Plugins -->

<script type="text/javascript" src="<%=path%>/js/jquery-1.7.1.min.js"></script>

<script type="text/javascript" src="<%=path%>/plugins/jimgareaselect/jquery.imgareaselect.min.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/jquery.dualListBox-1.3.min.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/jgrowl/jquery.jgrowl.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/jquery.filestyle.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/fullcalendar/fullcalendar.min.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/jquery.dataTables.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="plugins/flot/excanvas.min.js"></script>
<![endif]-->
<script type="text/javascript" src="<%=path%>/plugins/flot/jquery.flot.min.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/flot/jquery.flot.pie.min.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/flot/jquery.flot.stack.min.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/flot/jquery.flot.resize.min.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/colorpicker/colorpicker.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/tipsy/jquery.tipsy.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/sourcerer/Sourcerer-1.2.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/jquery.placeholder.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/jquery.validate.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/jquery.mousewheel.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/spinner/ui.spinner.js"></script>
<script type="text/javascript" src="<%=path%>/js/jquery-ui.js"></script>

<script type="text/javascript" src="<%=path%>/js/mws.js"></script>
<script type="text/javascript" src="<%=path%>/js/demo.js"></script>
<script type="text/javascript" src="<%=path%>/js/themer.js"></script>

<script type="text/javascript" src="<%=path%>/js/demo.dashboard.js"></script>

<title>工业大数据安全管理平台 - 控制台</title>

</head>
<body>

<!-- Main Wrapper -->
<div id="mws-wrapper">
	<jsp:include page="/menu.jsp" flush="true" />

    <!-- Container Wrapper -->
    <div id="mws-container" class="clearfix">

        <!-- Main Container -->
        <div class="container">

            <div class="mws-report-container clearfix">
                <a class="mws-report" href="#">
                    <span class="mws-report-icon mws-ic ic-building"></span>
                    <span class="mws-report-content">
                        	<span class="mws-report-title">Floors Climbed</span>
                            <span class="mws-report-value">324</span>
                        </span>
                </a>

                <a class="mws-report" href="#">
                    <span class="mws-report-icon mws-ic ic-sport"></span>
                    <span class="mws-report-content">
                        	<span class="mws-report-title">Calories Burned</span>
                            <span class="mws-report-value down">74%</span>
                        </span>
                </a>

                <a class="mws-report" href="#">
                    <span class="mws-report-icon mws-ic ic-walk"></span>
                    <span class="mws-report-content">
                        	<span class="mws-report-title">Kilometers Walked</span>
                            <span class="mws-report-value">14</span>
                        </span>
                </a>

                <a class="mws-report" href="#">
                    <span class="mws-report-icon mws-ic ic-bug"></span>
                    <span class="mws-report-content">
                        	<span class="mws-report-title">Bugs Fixed</span>
                            <span class="mws-report-value up">22%</span>
                        </span>
                </a>

                <a class="mws-report" href="#">
                    <span class="mws-report-icon mws-ic ic-car"></span>
                    <span class="mws-report-content">
                        	<span class="mws-report-title">Cars Repaired</span>
                            <span class="mws-report-value">77</span>
                        </span>
                </a>
            </div>

            <div class="mws-panel grid_5">
                <div class="mws-panel-header">
                    <span class="mws-i-24 i-graph">Charts</span>
                </div>
                <div class="mws-panel-body">
                    <div class="mws-panel-content">
                        <div id="mws-dashboard-chart" style="width:100%; height:215px;"></div>
                    </div>
                </div>
            </div>

            <div class="mws-panel grid_3">
                <div class="mws-panel-header">
                    <span class="mws-i-24 i-books-2">Website Summary</span>
                </div>
                <div class="mws-panel-body">
                    <ul class="mws-summary">
                        <li>
                            <span>1238</span> total visits
                        </li>
                        <li>
                            <span>512</span> votes
                        </li>
                        <li>
                            <span>11</span> new members
                        </li>
                        <li>
                            <span>716</span> products
                        </li>
                        <li>
                            <span>831</span> comments
                        </li>
                        <li>
                            <span>312</span> items purchased
                        </li>
                    </ul>
                </div>
            </div>

        </div>
        <!-- End Main Container -->

        <!-- Footer -->
        <!-- <div id="mws-footer">
            Copyright &copy; 2018.<a href="http://www.hrbeu.edu.cn/" target="_blank" title="哈尔滨工程大学">哈尔滨工程大学</a> All
            rights reserved.
        </div> -->
        <!-- End Footer -->

    </div>
    <!-- End Container Wrapper -->

</div>
<!-- End Main Wrapper -->

</body>
</html>