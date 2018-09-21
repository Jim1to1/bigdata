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

<%-- <script type="text/javascript" src="<%=path%>/js/jquery-1.7.1.min.js"></script> --%>

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

<script type="text/javascript">
	$(function() {
		var ids = new Array();
		//alert(111);
		//实现全选与反选  
		$("#allAndNotAll").click(function() {
			if (this.checked) {
				$("input[name='userSelect']:checkbox").each(function() {
					$(this).prop("checked", true);

					ids.push($(this).attr("value"));
				});
			} else {
				$("input[name='userSelect']:checkbox").each(function() {
					$(this).prop("checked", false);
				});
			}
			//var delIds=ids.join(",");   
			//console.log(delIds);
			// console.log(ids);
		});

		$("input[name='userSelect']:checkbox").click(function() {
			ids.push($(this).attr("value"));
			$("#allAndNotAll").prop("checked", false);
		});

		// 监听删除事件, 若没有选中删除条目, 提示未选中
		$("#deleteUser").click(function() {

			if (ids.length == 0) {
				alert("请选择删除内容项");
			} else {
				// alert(ids);
				//向后台交互
				$.ajax({
					url : "deleteUserById",
					type: "post",
					data:{"ids": ids},
					traditional: true, //这里设置为true
					success : function(data) {
						//do sth...
						window.location.reload();
					}
				});
			}

		});
	});
</script>

<title>工业大数据安全管理平台 - 用户管理</title>

</head>
<body>

	<!-- Main Wrapper -->
	<div id="mws-wrapper">
		<jsp:include page="/menu.jsp" flush="true" />

		<!-- Container Wrapper -->
		<div id="mws-container" class="clearfix">

			<!-- Main Container -->
			<div class="container">

				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-user-2">用户列表</span>
					</div>
					<div class="mws-panel-body">
						<div class="mws-panel-toolbar top clearfix">
							<ul>
								<li><a href="redirectAddUserPage" class="mws-ic-16 ic-add">添加</a></li>
								<li><a class="mws-ic-16 ic-cross" id="deleteUser">删除</a></li>
								<!-- <li><a href="#" class="mws-ic-16 ic-arrow-refresh">刷新</a></li> -->
							</ul>
						</div>
						<table class="mws-table">
							<thead>
								<tr>
									<th><input type="checkbox" id="allAndNotAll" />全选/反选</th>
									<th>用户名</th>
									<th>角色</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${userList}" var="user">
									<tr>
										<td><input type="checkbox" name="userSelect" value="${user.userId }" />选中/反选</td>
										<td>${user.userName }</td>
										<c:if test="${user.role == 1 }">
											<td>管理员</td>
										</c:if>
										<c:if test="${user.role == 2 }">
											<td>操作员</td>
										</c:if>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

			</div>
			<!-- End Main Container -->

		</div>
		<!-- End Container Wrapper -->
	</div>

</body>
</html>