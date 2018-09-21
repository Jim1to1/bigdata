<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Required Stylesheets -->
<link rel="stylesheet" type="text/css" href="<%=path%>/css/reset.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="<%=path%>/css/text.css"
	media="screen" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/fonts/ptsans/stylesheet.css" media="screen" />
<link rel="stylesheet" type="text/css" href="<%=path%>/css/fluid.css"
	media="screen" />

<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/mws.style.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/icons/icons.css" media="screen" />

<!-- Demo and Plugin Stylesheets -->
<link rel="stylesheet" type="text/css" href="<%=path%>/css/demo.css"
	media="screen" />

<link rel="stylesheet" type="text/css"
	href="<%=path%>/plugins/colorpicker/colorpicker.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/plugins/jimgareaselect/css/imgareaselect-default.css"
	media="screen" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/plugins/fullcalendar/fullcalendar.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/plugins/fullcalendar/fullcalendar.print.css"
	media="print" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/plugins/tipsy/tipsy.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/plugins/sourcerer/Sourcerer-1.2.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/plugins/jgrowl/jquery.jgrowl.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/plugins/spinner/spinner.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/jui/jquery.ui.css" media="screen" />

<!-- Theme Stylesheet -->
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/mws.theme.css" media="screen" />

<!-- JavaScript Plugins -->

<script type="text/javascript" src="<%=path%>/js/jquery-1.7.1.min.js"></script>

<script type="text/javascript"
	src="<%=path%>/plugins/jimgareaselect/jquery.imgareaselect.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/jquery.dualListBox-1.3.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/jgrowl/jquery.jgrowl.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/jquery.filestyle.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/fullcalendar/fullcalendar.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/jquery.dataTables.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="plugins/flot/excanvas.min.js"></script>
<![endif]-->
<script type="text/javascript"
	src="<%=path%>/plugins/flot/jquery.flot.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/flot/jquery.flot.pie.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/flot/jquery.flot.stack.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/flot/jquery.flot.resize.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/colorpicker/colorpicker.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/tipsy/jquery.tipsy.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/sourcerer/Sourcerer-1.2.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/jquery.placeholder.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/jquery.validate.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/jquery.mousewheel.js"></script>
<script type="text/javascript"
	src="<%=path%>/plugins/spinner/ui.spinner.js"></script>
<script type="text/javascript" src="<%=path%>/js/jquery-ui.js"></script>

<script type="text/javascript" src="<%=path%>/js/mws.js"></script>
<script type="text/javascript" src="<%=path%>/js/demo.js"></script>
<script type="text/javascript" src="<%=path%>/js/themer.js"></script>

<script type="text/javascript" src="<%=path%>/js/demo.dashboard.js"></script>

<title>工业大数据安全管理平台 - 恶意代码检测</title>

</head>
<body>

	<!-- Main Wrapper -->
	<div id="mws-wrapper">
		<%-- <%@include file="/menu.jsp"%> --%>
		<jsp:include page="/menu.jsp" flush="true" />

		<!-- Container Wrapper -->
		<div id="mws-container" class="clearfix">

			<!-- Main Container -->
			<div class="container">
				
				<div class="mws-panel grid_8">
                <div class="mws-panel-header">
                    <span class="mws-i-24 i-table-1">恶意代码检测</span>
                </div>
                <div class="mws-panel-body">
                    <table class="mws-datatable-fn mws-table">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>文件</th>
                            <th>安全状况</th>
                        </tr>
                        </thead>
                        <tbody>
	                        <c:forEach items="${pc13List}" var="pc13" varStatus="status">
								<tr>
									<td>$status.count</td>
									<td>${pc13.param1 }</td>
									<td>${pc13.param2 }</td>
								</tr>
							</c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
			</div>
		</div>
		<!-- End Main Container -->

	</div>
	<!-- End Container Wrapper -->

</body>
</html>