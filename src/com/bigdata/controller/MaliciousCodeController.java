package com.bigdata.controller;

import java.util.List;
import java.util.Map;

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
		
		List<MaliciousCode> maliciousCodeList = maliciousCodeService.getAllaliciousCode();
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
		List<MaliciousCode> maliciousCodeList = maliciousCodeService.getAllaliciousCode();
		map.put("maliciousCodeList", maliciousCodeList);
		
		return "maliciousCodePage";
	}
	
	@RequestMapping("/addMeliciousCode")
	public String addMailciousCode(HttpSession session, Map<String, Object> map,
			@RequestParam(value="codeName", required=false) String codeName,
			@RequestParam(value="codeDescribe", required=false) String codeDescribe) {
		
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		// 添加 maliciousCode
		MaliciousCode maliciousCode = new MaliciousCode();
		maliciousCode.setCodeName(codeName);
		maliciousCode.setCodeDescribe(codeDescribe);
		maliciousCodeService.addMaliciousCodeByEntity(maliciousCode);
		
		map.clear();
		List<MaliciousCode> maliciousCodeList = maliciousCodeService.getAllaliciousCode();
		map.put("maliciousCodeList", maliciousCodeList);
		
		return "maliciousCodePage";
	}
	
}
