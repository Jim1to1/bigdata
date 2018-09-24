<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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

<script type="text/javascript" src="plugins/elfinder/js/elfinder.min.js"></script>

<script type="text/javascript" src="plugins/plupload/plupload.js"></script>
<script type="text/javascript" src="plugins/plupload/plupload.flash.js"></script>
<script type="text/javascript" src="plugins/plupload/plupload.html4.js"></script>
<script type="text/javascript" src="plugins/plupload/plupload.html5.js"></script>
<script type="text/javascript"
	src="plugins/plupload/jquery.plupload.queue/jquery.plupload.queue.js"></script>

<link rel="stylesheet" href="plugins/plupload/jquery.plupload.queue.css" />
<link rel="stylesheet" href="plugins/elfinder/css/elfinder.css" />

<script type="text/javascript" src="js/mws.js"></script>
<script type="text/javascript" src="js/demo.js"></script>
<script type="text/javascript" src="js/themer.js"></script>

<script type="text/javascript" src="js/demo.files.js"></script>

<title>工业大数据安全管理平台 - 补丁库</title>

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
						<span class="mws-i-24 i-upload">Windows补丁上传</span>
					</div>
					<div class="mws-panel-body">
						<div id="uploader">
							<p>You browser doesn't have Flash, Silverlight, Gears,
								BrowserPlus or HTML5 support.</p>
						</div>
					</div>
				</div>

				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-upload">工业组件补丁上传</span>
					</div>
					<div class="mws-panel-body">
						<div id="uploader2">
							<p>You browser doesn't have Flash, Silverlight, Gears,
								BrowserPlus or HTML5 support.</p>
						</div>
					</div>
				</div>

				<!-- <div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-upload">网络协议上传</span>
					</div>
					<div class="mws-panel-body">
						<div id="uploader3">
							<p>You browser doesn't have Flash, Silverlight, Gears,
								BrowserPlus or HTML5 support.</p>
						</div>
					</div>
				</div> -->

			</div>
		</div>
		<!-- End Main Container -->

	</div>
	<!-- End Container Wrapper -->

</body>
</html>