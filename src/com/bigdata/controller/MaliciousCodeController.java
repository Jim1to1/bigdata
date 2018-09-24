package com.bigdata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bigdata.beans.MaliciousCode;
import com.bigdata.beans.User;
import com.bigdata.service.MaliciousCodeService;

@Controller
public class MaliciousCodeController {

	@Autowired
	private MaliciousCodeService maliciousCodeService;
	
	@RequestMapping("/redirectMaliciousCodePage")
	public String redirectMaliciousCodePage(HttpSession session, Map<String, Object> map) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		List<MaliciousCode> maliciousCodeList = maliciousCodeService.getAllMaliciousCode();
		map.put("maliciousCodeList", maliciousCodeList);
			
		return "maliciousCodePage";
		
	}
	
	@RequestMapping("/deleteMaliciousCode")
	public String deleteMaliciousCode(HttpSession session, Map<String, Object> map, 
			@RequestParam(value="codeSelect", required=false) Integer[] codeIds) {
		
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		// 测试传回数据
//		for(int i=0; i<codeIds.length; i++) {
//			System.out.println(codeIds[i]);
//		}
		
//		System.out.println("***" + codeIds.length);
		
		// 删除数据
		for(int i=0; i<codeIds.length; i++) {
			maliciousCodeService.deleteMaliciousCodeById(codeIds[i]);
		}
		
		map.clear();
		List<MaliciousCode> maliciousCodeList = maliciousCodeService.getAllMaliciousCode();
		map.put("maliciousCodeList", maliciousCodeList);
		
		return "maliciousCodePage";
	}
	
	@RequestMapping("/addMeliciousCode")
	public String addMailciousCode(HttpSession session, Map<String, Object> map,
			HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="codeName", required=false) String codeName,
			@RequestParam(value="codeDescribe", required=false) String codeDescribe) throws IOException {
		
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		List<MaliciousCode> maliciousCodeList = new ArrayList<>();
		
		session.setAttribute("tmpName", codeName);
		session.setAttribute("tmpDescribe", codeDescribe);
		
		if(maliciousCodeService.codeNameIsExist(codeName)) {
			response.setContentType("text/html; charset=UTF-8"); // 转码
		    PrintWriter out = response.getWriter();
		    out.flush();
		    
		    String tmpName = (String) session.getAttribute("tmpName");
			String tmpDescribe = (String) session.getAttribute("tmpDescribe");
		    if(tmpName.equals(codeName) && tmpDescribe.equals(codeDescribe)) {
				// 重复提交
				out.println("<script>");
			    out.println("alert('请勿重复提交！');");
			    out.println("</script>");
			}
			else {
				// 该用户名已经存在
			    out.println("<script>");
			    out.println("alert('该名称已经存在, 添加失败');");
			    out.println("</script>");
			}
		    
			// 获取所有用户后返回
			request.getSession().removeAttribute("tmpUsername");
			request.getSession().removeAttribute("tmpPassword");
			maliciousCodeList = maliciousCodeService.getAllMaliciousCode();
			map.put("maliciousCodeList", maliciousCodeList);
			return "maliciousCodePage";
		}
		
		// 添加 maliciousCode
		MaliciousCode maliciousCode = new MaliciousCode();
		maliciousCode.setCodeName(codeName);
		maliciousCode.setCodeDescribe(codeDescribe);
		maliciousCodeService.addMaliciousCodeByEntity(maliciousCode);
		
		response.setContentType("text/html; charset=UTF-8"); // 转码
	    PrintWriter out = response.getWriter();
	    out.flush();
	    out.println("<script>");
	    out.println("alert('添加成功!');");
	    out.println("</script>");
		
		map.clear();
		maliciousCodeList = maliciousCodeService.getAllMaliciousCode();
		map.put("maliciousCodeList", maliciousCodeList);
		
		return "maliciousCodePage";
	}
	
}
