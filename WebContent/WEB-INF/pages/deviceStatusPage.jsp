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
<script type="text/javascript" src="<%=path%>/scripts/jquery-1.10.2.js"></script>

<title>工业大数据安全管理平台 - 设备运行状态</title>

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

				<!-- PC4 -->
				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-user-2">用户信息</span>
					</div>
					<div class="mws-panel-body">
						<div class="mws-panel-content" style="display: flex">
							<table style="margin: auto">
								<tbody>
									<tr>
										<td style="padding: 10px">当前用户：${pc4.param1 }</td>
										<td style="padding: 10px">登录时间：${pc4.param2 }</td>
										<td style="padding: 10px">设备总开机时间：${pc4.param3 }</td>
									</tr>
									<tr>
										<td style="padding: 10px">CPU使用率：${pc4.param4 }</td>
										<td style="padding: 10px">内存使用率：${pc4.param5 }</td>
										<td style="padding: 10px">硬盘使用率：${pc4.param6 }</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>

				<!-- PC5 -->
				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-computer-imac">设备状态</span>
					</div>
					<div class="mws-panel-body">
						<div class="mws-panel-content" style="display: flex">
							<table style="margin: auto">
								<tbody>
									<tr>
										<td rowspan="4" style="padding: 10px"><img src="images/heupicture/temperature.png" height="75" width="75" /></td>
										<td rowspan="4" style="padding: 10px">主机温度：${pc5Inf[2].param1 }</td>
										<td rowspan="4" style="padding: 10px"><img src="images/heupicture/fan.png" height="75" width="75" /></td>
										<td style="padding: 10px">风扇转速：${pc5Inf[1].param2 }</td>
										<td rowspan="4" style="padding: 10px"><img src="images/heupicture/battery.png" height="75" width="75" /></td>
										<td style="padding: 10px">电池状态：${pc5Inf[0].param1 }</td>
									</tr>
									<tr>
										<td rowspan="3" style="padding: 10px">风扇状态：${pc5Inf[1].param1 }</td>
										<td style="padding: 10px">当前电源：${pc5Inf[0].param2 }</td>
									</tr>
									<tr>
										<td style="padding: 10px">电池状态：${pc5Inf[0].param3 }</td>
									</tr>
									<tr>
										<td style="padding: 10px">电池寿命：${pc5Inf[0].param4 }</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>

				<!-- PC6 -->
				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-table-1">账户信息</span>
					</div>
					<div class="mws-panel-body">
						<table class="mws-table">
							<thead>
								<tr>
									<th>名称</th>
									<th>描述</th>
								</tr>
							</thead>
							<tbody>
								<!-- pc6List -->
								<c:forEach items="${pc6List}" var="pc6">
									<tr>
										<td>${pc6.param1 }</td>
										<td>${pc6.param2 }</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

				<!-- PC7 -->
				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-table-1">进程信息</span>
					</div>
					<div class="mws-panel-body">
						<table class="mws-datatable-fn mws-table">
							<thead>
								<tr>
									<th>进程名称</th>
									<th>PID</th>
									<th>文件路径</th>
									<th>进程描述</th>
									<th>签名验证</th>
									<th>模块信息</th>
								</tr>
							</thead>
							<tbody>
								<!-- pc7List -->
								<c:forEach items="${pc7List}" var="pc7">
									<tr>
										<td>${pc7.param1 }</td>
										<td>${pc7.param2 }</td>
										<td>${pc7.param3 }</td>
										<td>${pc7.param4 }</td>
										<td>${pc7.param5 }</td>
										<td>${pc7.param6 }</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

				<!-- PC8 -->
				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-table-1">补丁信息</span>
					</div>
					<div class="mws-panel-body">
						<table class="mws-datatable-fn mws-table">
							<thead>
								<tr>
									<th>名称</th>
									<th>安装状态</th>
									<th>描述</th>
								</tr>
							</thead>
							<tbody>
								<!-- pc8List -->
								<c:forEach items="${pc8List}" var="pc8">
									<tr>
										<td>${pc8.param1 }</td>
										<td>${pc8.param2 }</td>
										<td>${pc8.param3 }</td>
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