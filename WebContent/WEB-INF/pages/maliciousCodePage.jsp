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
<%-- <script type="text/javascript" src="<%=path%>/scripts/jquery-1.10.2.js"></script> --%>
<script type="text/javascript">
	var ids = new Array();
	
	window.onload = function () {
		$("#allAndNotAll").click(function() {
			if (this.checked) {
				$("input[name='codeSelect']:checkbox").each(function() {
					$(this).prop("checked", true);

					ids.push($(this).attr("value"));
				});
			} else {
				$("input[name='codeSelect']:checkbox").each(function() {
					$(this).prop("checked", false);
				});
			}
			//var delIds=ids.join(",");   
			//console.log(delIds);
			// console.log(ids);
		});
		
		$("input[name='codeSelect']:checkbox").click(function() {
			ids.push($(this).attr("value"));
			$("#allAndNotAll").prop("checked", false);
		});
		
		$("#submitCode").submit(function(e) {
			var codeName = $("#codeName").val();
			codeName = $.trim(codeName);
			//alert(codeName);
			
			var ret = /^([a-f0-9A-F]{2}\s*)+/;
			// var ret = /^\d+$/

			if(ret.test(codeName)) {
				alert('添加成功');
		    }
			else {
				e.preventDefault();
				alert("代码名称格式不正确");
		    }
	    });
	};
	
	$(document).bind("keydown", function(e) {//文档绑定键盘按下事件
	    e = window.event || e;//解决浏览器兼容的问题   
	    if(e.keyCode == 116) {//F5按下
	    	return false;
	    }
	});
	
	function deleteCode() {
		if(ids.length == 0) {
        	alert("请选择项目");
        	return false;
       	}
		else {
			document.getElementById('mform').submit();
		}
	};
</script>

<title>工业大数据安全管理平台 - 恶意代码库</title>

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
	width: 55%;
	height: 55%;
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
		<form id="submitCode" class="mws-form" action="addMeliciousCode" method="post">
            <div class="mws-form-row">
            	<div class="mws-form-item large">
                	<input type="text" id="codeName" name="codeName" class="mws-login-username mws-textinput" placeholder="特征名称" />
                </div>
            </div>
            <div class="mws-form-row">
            	<div class="mws-form-item large">
                	<input type="text" name="codeDescribe" class="mws-login-username mws-textinput" placeholder="特征描述" />
                </div>
            </div>
            <div class="mws-form-row">
            	<input type="submit" value="添加" class="mws-button green mws-login-button" />
            	<a class="mws-button green mws-login-button" onclick="closeDialog()">关闭</a>
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
						<span class="mws-i-24 i-table-1">恶意代码库</span>
					</div>
					<div class="mws-panel-body">
						<form action="deleteMaliciousCode" method="post" id="mform">
							<div class="mws-panel-toolbar top clearfix">
								<ul>
									<li><a href = "JavaScript:void(0)" onclick = "openDialog()" class="mws-ic-16 ic-add">添加</a></li>
									<li><a onclick="deleteCode()" class="mws-ic-16 ic-cross">删除选中项</a></li>
									<!-- <li><a href="#" class="mws-ic-16 ic-printer">打印</a></li> -->
									<!-- <li><a href="#" class="mws-ic-16 ic-arrow-refresh">刷新</a></li> -->
									<!-- <li><a onclick="aClick()" class="mws-ic-16 ic-edit">修改更新</a></li> -->
								</ul>
							</div>
	
							<table class="mws-datatable-fn mws-table">
								<thead>
									<tr>
										<th></th>
										<th>特征名称</th>
										<th>描述</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${maliciousCodeList}" var="maliciousCode">
										<tr>
											<td><input type="checkbox" name='codeSelect' value="${maliciousCode.codeId }" /></td>
											<td>${maliciousCode.codeName }</td>
											<td>${maliciousCode.codeDescribe }</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</form>
					</div>
				</div>

			</div>
		</div>
		<!-- End Main Container -->

	</div>
	<!-- End Container Wrapper -->
</body>
<script type="text/javascript">
    function openDialog(){
        document.getElementById('light').style.display='block';
        document.getElementById('fade').style.display='block'
    }
    function closeDialog(){
        document.getElementById('light').style.display='none';
        document.getElementById('fade').style.display='none'
    }
</script>
</html>