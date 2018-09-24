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

<title>工业大数据安全管理平台 - 网络协议检测</title>

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
						<span>概要情况统计</span>
					</div>
					<div class="mws-panel-body">
						<div class="mws-panel-content" style="display: flex">
							<table style="margin: auto">
								<tbody>
									<tr>
										<td rowspan="4" style="padding: 10px"><img
											src="images/heupicture/datapacket.png" height="75" width="75" />
										</td>
										<td style="padding: 10px">Top3 工业协议数据包</td>
										<td rowspan="4" style="padding: 10px"><img
											src="images/heupicture/location.png" height="75" width="75" />
										</td>
										<td style="padding: 10px">Top3 源IP</td>
										<td rowspan="4" style="padding: 10px"><img
											src="images/heupicture/location2.png" height="75" width="75" />
										</td>
										<td style="padding: 10px">Top3 目的IP</td>
									</tr>
									<tr>
										<td style="padding: 10px">1. ${protocolNameInDes[0]}</td>
										<td style="padding: 10px">1. ${srcIpInDes[0]}</td>
										<td style="padding: 10px">1. ${destIpInDes[0]}</td>
									</tr>
									<tr>
										<td style="padding: 10px">2. ${protocolNameInDes[1]}</td>
										<td style="padding: 10px">2. ${srcIpInDes[1]}</td>
										<td style="padding: 10px">2. ${destIpInDes[1]}</td>
									</tr>
									<tr>
										<td style="padding: 10px">3. ${protocolNameInDes[2]}</td>
										<td style="padding: 10px">3. ${srcIpInDes[2]}</td>
										<td style="padding: 10px">3. ${destIpInDes[2]}</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>

				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-table-1">详细情况统计</span>
					</div>
					<div class="mws-panel-body">
						<table class="mws-datatable-fn mws-table">
							<thead>
								<tr>
									<th>检测时间</th>
									<th>工业协议</th>
									<th>源IP地址</th>
									<th>目的IP地址</th>
									<th>详细信息</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${allIndustrialProtocol}" var="industrialProtocol">
									<tr>
										<td>${industrialProtocol.recepTime }</td>
										<td>${industrialProtocol.protocolName }</td>
										<td>${industrialProtocol.srcIp }</td>
										<td>${industrialProtocol.destIp }</td>
										<td>${industrialProtocol.protocolInfo }</td>
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