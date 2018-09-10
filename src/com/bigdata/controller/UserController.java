package com.bigdata.controller;

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
	
	/**
	 * 用户登陆
	 * @param userName
	 * @param passWord
	 * @param session
	 * @return
	 */
	@RequestMapping("/userLogin")
	public String userLogin(@RequestParam("form-username") String userName, @RequestParam("form-password") String passWord, HttpSession session) {
		User user = userService.getUserByUserNameAndPassWord(userName, passWord);
		if(user == null) {
			// 无当前用户, 跳转至失败页面
			return "error";
		} else {
			// 有当前用户，跳转至主界面
			session.setAttribute("user", user);
			
			return "index";
		}
	}
	
	/**
	 * 用户退出
	 * @param session
	 * @return
	 */
	@RequestMapping("/userLogout")
	public String userLogout(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user != null) {
			session.removeAttribute("user");
		}
		
		return "redirect:/login.jsp";
	}
	
}
