package com.bigdata.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bigdata.beans.User;
import com.bigdata.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// 跳转功能

	/**
	 * 跳转至登陆页面
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/redirectLoginPage")
	public String redirectLoginPage(HttpSession session) {
		return "redirect:/login.jsp";
	}

	/**
	 * 跳转至主页面
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/redirectIndex")
	public String redirectIndex(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user == null) {
			return "redirect:/login.jsp";
		}

		return "index";
	}

	// 非跳转功能

	/**
	 * 用户登陆
	 * 
	 * @param userName
	 * @param passWord
	 * @param session
	 * @return
	 */
	@RequestMapping("/userLogin")
	public String userLogin(HttpSession session, HttpServletRequest request, @RequestParam(value="userName", required=false) String userName,
			@RequestParam(value="password", required=false) String password) {
//		System.out.println(request.getRemoteAddr());
		// System.out.println(getIpAddress(request));
		User user = userService.getUserByUserNameAndPsw(userName, password);
		if (user == null) {
			// 无当前用户, 跳转至失败页面
			return "error";
		} else {
			// 有当前用户，跳转至主界面
			session.setAttribute("loginIP", request.getRemoteAddr());
			session.setAttribute("user", user);
			return "index";
		}
	}

	/**
	 * 用户退出
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/userLogout")
	public String userLogout(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user != null) {
			session.removeAttribute("user");
		}

		return "redirect:/login.jsp";
	}

	public String getIpAddress(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

}
