package com.bigdata.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.bigdata.beans.User;

@Controller
public class FileUploadHandler {
	
	@RequestMapping("/getRequestPage")
	public String getRequestPage() {
		return "getRequest";
	}
	
	@RequestMapping("/getRequest")
	@ResponseBody
	public List<List<Integer>> getRequest(Map<String, Object> map) {
		System.out.println("run getRequest");
		List<Integer> list1 = new ArrayList<>();
		list1.add(123);
		list1.add(234);
		
		List<Integer> list2 = new ArrayList<>();
		for(int i=0; i<20000; i++) {
			list2.add(i);
		}
		
		List<List<Integer>> resultList = new ArrayList<>();
		resultList.add(list1);
		resultList.add(list2);
		
		return resultList;
	}
	
	@RequestMapping("/redirectUploadPage")
	public String redirectUploadPage(HttpSession session) { 
		
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		return "upload";
	}

	@RequestMapping("/fileUpload")
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {
		String uploadPath = "D:/uploadFile";
		
        //String path = "E:/" + file.getOriginalFilename();
        File uploadFile = new File(uploadPath);
		
		if(!uploadFile.exists()) {
			uploadFile.mkdirs();
		}
		
        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        file.transferTo(new File("D:/uploadFile/" + file.getOriginalFilename()));
        return "index"; 
    }

}
