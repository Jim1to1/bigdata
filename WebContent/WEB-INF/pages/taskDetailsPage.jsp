<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Required Stylesheets -->
<link rel="stylesheet" type="text/css" href="css/reset.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="css/text.css"
	media="screen" />
<link rel="stylesheet" type="text/css"
	href="css/fonts/ptsans/stylesheet.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/fluid.css"
	media="screen" />

<link rel="stylesheet" type="text/css" href="css/mws.style.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="css/icons/icons.css"
	media="screen" />

<!-- Demo and Plugin Stylesheets -->
<link rel="stylesheet" type="text/css" href="css/demo.css"
	media="screen" />

<link rel="stylesheet" type="text/css"
	href="plugins/colorpicker/colorpicker.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="plugins/jimgareaselect/css/imgareaselect-default.css"
	media="screen" />
<link rel="stylesheet" type="text/css"
	href="plugins/fullcalendar/fullcalendar.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="plugins/fullcalendar/fullcalendar.print.css" media="print" />
<link rel="stylesheet" type="text/css" href="plugins/tipsy/tipsy.css"
	media="screen" />
<link rel="stylesheet" type="text/css"
	href="plugins/sourcerer/Sourcerer-1.2.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="plugins/jgrowl/jquery.jgrowl.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="plugins/spinner/spinner.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/jui/jquery.ui.css"
	media="screen" />

<!-- Theme Stylesheet -->
<link rel="stylesheet" type="text/css" href="css/mws.theme.css"
	media="screen" />

<!-- JavaScript Plugins -->

<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>

<script type="text/javascript"
	src="plugins/jimgareaselect/jquery.imgareaselect.min.js"></script>
<script type="text/javascript"
	src="plugins/jquery.dualListBox-1.3.min.js"></script>
<script type="text/javascript" src="plugins/jgrowl/jquery.jgrowl.js"></script>
<script type="text/javascript" src="plugins/jquery.filestyle.js"></script>
<script type="text/javascript"
	src="plugins/fullcalendar/fullcalendar.min.js"></script>
<script type="text/javascript" src="plugins/jquery.dataTables.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="plugins/flot/excanvas.min.js"></script>
<![endif]-->
<script type="text/javascript" src="plugins/flot/jquery.flot.min.js"></script>
<script type="text/javascript" src="plugins/flot/jquery.flot.pie.min.js"></script>
<script type="text/javascript"
	src="plugins/flot/jquery.flot.stack.min.js"></script>
<script type="text/javascript"
	src="plugins/flot/jquery.flot.resize.min.js"></script>
<script type="text/javascript" src="plugins/colorpicker/colorpicker.js"></script>
<script type="text/javascript" src="plugins/tipsy/jquery.tipsy.js"></script>
<script type="text/javascript" src="plugins/sourcerer/Sourcerer-1.2.js"></script>
<script type="text/javascript" src="plugins/jquery.placeholder.js"></script>
<script type="text/javascript" src="plugins/jquery.validate.js"></script>
<script type="text/javascript" src="plugins/jquery.mousewheel.js"></script>
<script type="text/javascript" src="plugins/spinner/ui.spinner.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>

<script type="text/javascript" src="js/mws.js"></script>
<script type="text/javascript" src="js/demo.js"></script>
<script type="text/javascript" src="js/themer.js"></script>

<title>工业大数据安全管理平台 - 漏洞详情</title>

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
			
				<div class="mws-panel grid_1">
                <div class="mws-panel-header">
                    <a href='redrictTaskManagementPage'><span class="mws-i-24 i-bended-arrow-left">返回</span></a>
                </div>
            </div>

				<!-- 属性信息 -->
				<div class="mws-panel grid_4">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-computer-imac">属性</span>
					</div>
					<div class="mws-panel-body">
						<div class="mws-panel-content" style="display: flex">
							<table style="margin: auto">
								<tbody>
									<tr>
										<td style="padding: 10px">扫描设备IP：</td>
										<td style="padding: 10px">${requestScope.devIP }</td>
									</tr>
									<tr>
										<td style="padding: 10px">操作系统：</td>
										<td style="padding: 10px">${requestScope.operationDetail }</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>

				<!-- 开放端口及服务 -->
				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-table-1">开放端口及服务</span>
					</div>
					<div class="mws-panel-body">
						<table class="mws-datatable-fn mws-table">
							<!-- 网络端口 服务名称  状态 厂商  版本 额外信息 -->
							<thead>
								<tr>
									<th>网络端口</th>
									<th>服务名称</th>
									<th>状态</th>
									<th>厂商</th>
									<th>版本</th>
									<th>额外信息</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${portList}" var="port">
									<tr>
										<td>${port.param1 }</td>
										<td>${port.param2 }</td>
										<td>${port.param3 }</td>
										<td>${port.param4 }</td>
										<td>${port.param5 }</td>
										<td>${port.param6 }</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

				<!-- 漏洞详情 -->
				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-table-1">漏洞详情</span>
					</div>
					<div class="mws-panel-body">
						<table class="mws-datatable-fn mws-table">
							<thead>
								<tr>
									<th>检测时间</th>
									<th>漏洞</th>
									<th>漏洞详情</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${vulnerabilityList}" var="vulnerability">
									<tr>
										<td>${vulnerability.param1 }</td>
										<td>${vulnerability.param2 }</td>
										<td>${vulnerability.param3 }</td>
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