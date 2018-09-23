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

<script type="text/javascript">
	var ids = new Array();
	var status = false;

	//每隔一段时间执行一次的函数
	function getTaskStatus() {
		//var tbody = window.document.getElementById("tbody-result");

		$.ajax({
			type : "POST",
			url : "getTaskStatus",
			dataType : "json",
			success : function(data) {
				var tbody = $("#mtbody");
				
				var str = "";
	    	   	for(var i=0; i<data.length; i++) {
	    	   		
	    	   		// 奇数行
	    	   		if(i % 2 == 1) {
	    	   			str += "<tr class='odd'>";
	    	   		}
	    	   		// 偶数行
	    	   		else {
	    	   			str += "<tr class='even'>";	    	   			
	    	   		}
	    	   		
		    	   	str += "<td><input type='checkbox' name='taskSelect' value=" + data[i].taskId + " /></td>";
		    	   	str += "<td><a href='taskDetails?taskId=" + data[i].taskId + "'>" + data[i].tmdescribe + "</a></td>";
		    	   	str += "<td>" + data[i].devIP + "</td>";
		    	   	str += "<td>" + data[i].addTime + "</td>";
		    	   	
		    	   	var tmstatus = data[i].tmstatus;
		    	   	if(tmstatus == 0) {
		    	   		str += "<td><a href='taskStart?taskId=" + data[i].taskId + "'><img src='images/heupicture/task-start.png' height='20' width='20' /></a></td>";
		    	   	}
		    	   	else if(tmstatus == 1) {
		    	   		str += "<td><img src='images/heupicture/task-running.png' height='20' width='20' /></td>";
		    	   	}
		    	   	else if(tmstatus == 2) {
		    	   		str += "<td><img src='images/heupicture/task-complete.png' height='20' width='20' /></td>";
		    	   	}
		    	   	
		    	   	str += "<tr>";
	    	   	}
	    	   	$("#mtbody").html(str);
	    	   	//tbody.innerHTML = str;
			}
		});

	};
	//主动调用
	setInterval("getTaskStatus()", 5000);

	window.onload = function() {
		$("input[name='taskSelect']:checkbox").click(function() {
			ids.push($(this).attr("value"));
		});
	};

	function getTaskDetails(taskId) {
		//alert("taskId: " + taskId);
		$.ajax({
			url : "taskDetails",
			type : "post",
			data : {
				"taskId" : taskId
			},
			traditional : true, //这里设置为true
			success : function(data) {
				//do sth...
				window.location.reload();
			}
		});

	};

	function deleteTask() {
		if (ids.length == 0) {
			alert("请选择删除内容项");
		} else {
			// alert(ids);
			//向后台交互
			$.ajax({
				url : "deleteTaskManagementById",
				type : "post",
				data : {
					"ids" : ids
				},
				traditional : true, //这里设置为true
				success : function(data) {
					//do sth...
					window.location.reload();
				}
			});
		}
	};
</script>

<title>工业大数据安全管理平台 - 漏洞检测</title>

<!-- 测试添加 -->
<style>
.black_overlay {
	display: none;
	position: absolute;
	top: 0%;
	left: 0%;
	width: 100%;
	height: 100%;
	background-color: rgba(255, 255, 255, 0.2);
	z-index: 1001;
	-moz-opacity: 0.8;
	opacity: .80;
	filter: alpha(opacity = 88);
}

.white_content {
	display: none;
	position: absolute;
	top: 25%;
	left: 25%;
	width: 45%;
	height: 45%;
	padding: 5px;
	border: 10px solid white;
	background-color: Gainsboro;
	z-index: 1002;
	overflow: auto;
}
</style>

</head>
<body>
	
	<!-- 测试部分 -->
	<div id="light" class="white_content">
		<br><br>
		<center>
		<h4>添加任务</h4>
		</center>
		<form class="mws-form" action="addTaskManagement" method="post">
			<div class="mws-form-row">
				<div class="mws-form-item large">
					<input type="text" name="tmdescribe"
						class="mws-login-username mws-textinput" placeholder="任务描述" />
				</div>
			</div>
			<div class="mws-form-row">
				<div class="mws-form-item large">
					<input type="text" name="devIP"
						class="mws-login-username mws-textinput" placeholder="扫描IP" />
				</div>
			</div>
			<div class="mws-form-row">
				<center>
				<input type="submit" value="添加" class="mws-button green mws-login-button" /> 
				<a class="mws-button green mws-login-button" onclick="closeDialog()">关闭</a>
				</center>
			</div>
		</form>
	</div>
	<div id="fade" class="black_overlay"></div>

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
						<span class="mws-i-24 i-table-1">漏洞任务列表</span>
					</div>
					<div class="mws-panel-body">
						<div class="mws-panel-toolbar top clearfix">
							<ul>
								<li><a href="JavaScript:void(0)" onclick="openDialog()"
									class="mws-ic-16 ic-add">添加</a></li>
								<li><a onclick="deleteTask()" class="mws-ic-16 ic-cross">删除选中项</a></li>
								<!-- <li><a href="#" class="mws-ic-16 ic-printer">打印</a></li> -->
								<!-- <li><a href="#" class="mws-ic-16 ic-arrow-refresh">刷新</a></li> -->
								<!-- <li><a onclick="aClick()" class="mws-ic-16 ic-edit">修改更新</a></li> -->
							</ul>
						</div>

						<table class="mws-datatable-fn mws-table">
							<thead>
								<tr>
									<th>全选/反选</th>
									<th>任务描述</th>
									<th>扫描IP</th>
									<th>任务添加时间</th>
									<th>任务状态</th>
								</tr>
							</thead>
							<tbody id="mtbody">
								<c:forEach items="${taskManagementList}" var="taskManagement">
									<tr>
										<td><input type="checkbox" name='taskSelect' value="${taskManagement.taskId }" /></td>
										<td><a href="taskDetails?taskId=${taskManagement.taskId }">${taskManagement.tmdescribe }</a></td>
										<!-- 跳转至漏洞详情 taskDetails -->
										<td>${taskManagement.devIP }</td>
										<td>${taskManagement.addTime }</td>

										<c:if test="${taskManagement.tmstatus == 0}">
											<td><a href="taskStart?taskId=${taskManagement.taskId }"><img src='images/heupicture/task-start.png' height='20' width='20' /></a></td>
										</c:if>
										<c:if test="${taskManagement.tmstatus == 1}">
											<td><img src="images/heupicture/task-running.png" height="20" width="20" /></td>
										</c:if>
										<c:if test="${taskManagement.tmstatus == 2}">
											<td><img src='images/heupicture/task-complete.png' height="20" width="20" /></td>
										</c:if>
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
<script type="text/javascript">
	function openDialog() {
		document.getElementById('light').style.display = 'block';
		document.getElementById('fade').style.display = 'block'
	}
	function closeDialog() {
		document.getElementById('light').style.display = 'none';
		document.getElementById('fade').style.display = 'none'
	}
</script>
</html>