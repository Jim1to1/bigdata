<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!-- Header Wrapper -->
<div id="mws-header" class="clearfix">

    <!-- Logo Wrapper -->
    <div id="mws-logo-container">
        <div id="mws-logo-wrap">
            <img src="<%=path%>/images/mws-logo.png" alt="mws admin"/>
        </div>
    </div>

    <!-- User Area Wrapper -->
    <div id="mws-user-tools" class="clearfix">

        <!-- User Functions -->
        <div id="mws-user-info" class="mws-inset">
            <div id="mws-user-photo">
                <img src="<%=path%>/example/profile.jpg" alt="User Photo"/>
            </div>
            <div id="mws-user-functions">
                <div id="mws-username">
                                 欢迎你, [${sessionScope.user.userName}]
                </div>
                <ul>
                    <li><a href="#">个人信息</a></li>
                    <li><a href="table5-2.html">修改密码</a></li>
                    <li><a href="index-2.html">退出</a></li>
                </ul>
            </div>
        </div>
        <!-- End User Functions -->

    </div>
</div>

<!-- Necessary markup, do not remove -->
<div id="mws-sidebar-stitch"></div>
<div id="mws-sidebar-bg"></div>

<!-- Sidebar Wrapper -->
<div id="mws-sidebar">

    <!-- Main Navigation -->
    <div id="mws-navigation">
        <ul>
            <li class="active"><a href="redirectIndex" class="mws-i-24 i-home">控制台</a></li>
            <li>
                <a href="#" class="mws-i-24 i-table-1">数据安全核查</a>
                <ul>
                    <li>
                        <a href="#">主机核查配置</a>
                        <ul>
                            <li><a href="getHostInf">设备硬件信息</a></li>
                            <li><a href="getDeviceStatus">设备运行状态</a></li>
                            <li><a href="getDeviceNetworkInf">设备网络信息</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">恶意文档检测</a>
                        <ul>
                            <li><a href="maliciousCodeDetection">恶意代码检测</a></li>
                            <li><a href="redirectMaliciousCodePage">恶意代码库</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li>
                <a href="getAllIndustrialProtocol" class="mws-i-24 i-globe">网络协议检测</a>
            </li>
            <li>
                <a href="#" class="mws-i-24 i-computer-imac">系统安全</a>
                <ul>
                    <li><a href="table3-1.html">漏洞检测</a></li>
                    <li><a href="getSecurityLogPage">日志追踪</a></li>
                    <li><a href="table3-3.html">漏洞详情</a></li>
                </ul>
            </li>
            <li>
                <a href="#" class="mws-i-24 i-text-document">知识库</a>
                <ul>
                    <li><a href="table4-1.html">漏洞库</a></li>
                    <li><a href="table4-2.html">补丁库</a></li>
                </ul>
            </li>
            <li>
                <a href="#" class="mws-i-24 i-cog">系统管理</a>
                <ul>
                    <li><a href="redirectUserManagement">用户管理</a></li>
                    <li><a href="redirectPasswordManagement">密码管理</a></li>
                    <li><a href="table5-3.html">系统日志</a></li>
                </ul>
            </li>
        </ul>
    </div>
    <!-- End Navigation -->
</div>
