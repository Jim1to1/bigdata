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

<!-- 新密码与确认密码验证 -->
<script type="text/javascript">

	$("form").submit(function(e) {
		
		var oldPassword = $("#oldPassword").val();	// 用户名
		var newPassword = $("#newPassword").val();	// 密码
		var confirmPassword = $("#confirmPassword").val();	// 昵称
		
		oldPassword = $.trim(oldPassword);
		newPassword = $.trim(newPassword);
		confirmPassword = $.trim(confirmPassword);
		
		if(oldPassword.length == 0) {
	    	e.preventDefault();
	    	alert("请填写原始密码");
		} else if(newPassword.length == 0) {
			e.preventDefault();
			alert("请填写新密码");
		} else if(confirmPassword.length == 0) {
			e.preventDefault();
			alert("请填写确认密码");
		} else if(newPassword != confirmPassword) {
			e.preventDefault();
			alert("新密码与旧密码不一致");
		} else {
			alert("提交成功!");
		}
		
	});

</script>

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

				<div class="mws-panel grid_4">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-cog">修改密码</span>
					</div>
					<div class="mws-panel-body">
						<div class="mws-panel-content" style="display: flex">
							<form action="changePassword" method="post">
								<table style="margin: auto">
									<tbody>
										<tr>
											<td style="padding: 10px">原始密码：</td>
											<td style="padding: 10px">
												<input type="password" name="oldPassword" id="oldPassword" />
											</td>
										</tr>
										<tr>
											<td style="padding: 10px">新密码：</td>
											<td style="padding: 10px">
												<input type="password" name="newPassword" id="newPassword" />
											</td>
										</tr>
										<tr>
											<td style="padding: 10px" rowspan="2">确认新密码：</td>
											<td style="padding: 10px">
												<input type="password" name="confirmPassword" id="confirmPassword" />
											</td>
										</tr>
										<tr>
											<td style="padding: 10px">
												<input type="submit" id="submit-password" class="mws-button blue" value="提交修改">
											</td>
										</tr>
									</tbody>
								</table>
							</form>
						</div>
					</div>
				</div>

			</div>
		</div>
		<!-- End Main Container -->

	</div>
	<!-- End Container Wrapper -->

</body>
</html>