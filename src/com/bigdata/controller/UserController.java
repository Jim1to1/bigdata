package com.bigdata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
		if(userName == null || password == null) {
			return "redirect:/login.jsp";
		}
		
		User user = userService.getUserByUserNameAndPsw(userName, password);
		if (user == null) {
			// 无当前用户, 跳转至失败页面
			return "error";
		} else {
			// 有当前用户，跳转至主界面
			session.setAttribute("loginIP", request.getRemoteAddr());
			// System.out.println(request.getRemoteAddr());
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
	
	/**
	 * 
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping("/redirectPasswordManagement")
	public String redirectPasswordManagement(HttpSession session, HttpServletRequest request) {
		User user = (User) session.getAttribute("user");
		
		if(user != null) {
			return "passwordManagement";
		}
		
		// 如果用户为空, 表示没有登陆, 跳转回登陆界面进行登陆
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("/changePassword")
	public String changePassword(HttpSession session, HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="oldPassword", required=false) String oldPassword,
			@RequestParam(value="newPassword", required=false) String newPassword) throws IOException {
		
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		user = userService.getUserByUserNameAndPsw(user.getUserName(), oldPassword);
		if(user == null) {
			// 提示: 旧密码输入错误
			response.setContentType("text/html; charset=UTF-8"); //转码
		    PrintWriter out = response.getWriter();
		    out.flush();
		    out.println("<script>");
		    out.println("alert('旧密码输入错误！');");
		    out.println("</script>");
		    
		    return "passwordManagement";
		}
		
		user.setPassword(newPassword);

		// 修改密码成功
		userService.updateUser(user);
		
		// 修改密码成功后,进行用户推出操作并跳转至登陆页面
		session.removeAttribute("user");
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("/redirectUserManagement")
	public String redirectUserManagement(HttpSession session, Map<String, Object> map, HttpServletRequest request) {
		
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		// 获取所有用户后返回
	    List<User> userList = userService.getAllUser();
	    map.put("userList", userList);
		
		return "userManagement";
		
	}
	
	@RequestMapping("/redirectAddUserPage")
	public String redirectAddUserPage(HttpSession session, Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		if(user.getRole() == 0) {
			response.setContentType("text/html; charset=UTF-8"); // 转码
		    PrintWriter out = response.getWriter();
		    out.flush();
		    out.println("<script>");
		    out.println("alert('您不是管理员, 无权限');");
		    out.println("</script>");
		    
		    // 获取所有用户后返回
		    List<User> userList = userService.getAllUser();
		    map.put("userList", userList);
		    
		    return "userManagement";
		}
		
		// 获取所有用户后返回
	    List<User> userList = userService.getAllUser();
	    map.put("userList", userList);
		
		return "addUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(HttpSession session, Map<String, Object> map, HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="username", required=false) String username,
			@RequestParam(value="password", required=false) String password,
			@RequestParam(value="role", required=false) Integer role) throws IOException {
		
		User sessionUser = (User) session.getAttribute("user");
		if(sessionUser == null) {
			return "redirect:/login.jsp";
		}
		
		if(userService.validateIsExist(username)) {
			// 该用户名已经存在
			response.setContentType("text/html; charset=UTF-8"); // 转码
		    PrintWriter out = response.getWriter();
		    out.flush();
		    out.println("<script>");
		    out.println("alert('该用户名已经存在, 添加失败');");
		    out.println("</script>");
		    
		    return "addUser";
		}
		
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		user.setRole(role);
		
		userService.addUser(user);
		response.setContentType("text/html; charset=UTF-8"); // 转码
	    PrintWriter out = response.getWriter();
	    out.flush();
	    out.println("<script>");
	    out.println("alert('添加成功!');");
	    out.println("</script>");
	    
	    // 获取所有用户后返回
	    List<User> userList = userService.getAllUser();
	    map.put("userList", userList);
		
		return "userManagement";
	}
	
	@RequestMapping("/deleteUserById")
	public String deleteUserById(HttpSession session, Map<String, Object> map, 
			@RequestParam(value="ids", required=false) Integer[] userIds) {
//		System.out.println("deleteUserById...");
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		// 测试传递过来的数据是否正确
//		for(int i=0; i<userIds.length; i++) {
//			System.out.println("id: " + userIds[i]);
//		}
//		System.out.println(userIds.length);
		
		// 删除数据
		for(int i=0; i<userIds.length; i++) {
			userService.deleteUserById(userIds[i]);
		}
		
		// 获取所有用户后返回
	    List<User> userList = userService.getAllUser();
	    map.put("userList", userList);
		
		return "userManagement";
	}

}
