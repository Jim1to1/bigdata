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

<title>工业大数据安全管理平台 - 设备硬件信息</title>

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
				<div class="mws-panel grid_4">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-table-1">基础配置</span>
					</div>
					<div class="mws-panel-body">
						<div class="mws-panel-content" style="display: flex">
							<table style="margin: auto">
								<tbody>
									<tr>
										<td style="padding: 10px">操作系统:${hostInf.param1 }</td>
										<td style="padding: 10px">硬件平台:${hostInf.param2 }</td>
										<td style="padding: 10px">CPU核数:${hostInf.param3 }核</td>
									</tr>
									<tr>
										<td style="padding: 10px">内存大小:${hostInf.param4 }</td>
										<td style="padding: 10px">磁盘大小:${hostInf.param5 }</td>
										<td style="padding: 10px">串口数量:${hostInf.param3 }</td>
									</tr>
									<tr>
										<td style="padding: 10px">并口数量:${hostInf.param7 }</td>
										<td style="padding: 10px">接入USB数量:${hostInf.param8 }</td>
										<td style="padding: 10px">接入光驱数量:${hostInf.param9 }</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>

				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-table-1">磁盘信息</span>
					</div>
					<div class="mws-panel-body">
						<table class="mws-table">
							<thead>
								<tr>
									<th>盘符</th>
									<th>分区大小</th>
									<th>文件格式</th>
									<th>磁盘类型</th>
									<th>已用大小</th>
									<th>空闲大小</th>
									<th>分区利用率</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>C:\\</td>
									<td>237.227GB</td>
									<td>NTFS</td>
									<td>rw,fixed</td>
									<td>102.058GB</td>
									<td>135.169GB</td>
									<td>43.0%</td>
								</tr>
								<tr>
									<td>D:\\</td>
									<td>237.227GB</td>
									<td>NTFS</td>
									<td>rw,fixed</td>
									<td>102.058GB</td>
									<td>135.169GB</td>
									<td>43.0%</td>
								</tr>
								<tr>
									<td>E:\\</td>
									<td>237.227GB</td>
									<td>NTFS</td>
									<td>rw,fixed</td>
									<td>102.058GB</td>
									<td>135.169GB</td>
									<td>43.0%</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>

				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-table-1">驱动程序</span>
					</div>
					<div class="mws-panel-body">
						<table class="mws-table">
							<thead>
								<tr>
									<th>驱动程序名称</th>
									<th>驱动程序地址</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1394bus.sys</td>
									<td>C:\\Windows\System32\1394.sys</td>
								</tr>
								<tr>
									<td>mousepad.sys</td>
									<td>C:\\Windows\System32\mousepad.sys</td>
								</tr>
								<tr>
									<td>keyboard.sys</td>
									<td>C:\\Windows\System32\keyboard.sys</td>
								</tr>
							</tbody>
						</table>
					</div>
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

</body>
</html>