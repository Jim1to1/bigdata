package com.bigdata.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigdata.beans.HostInf;
import com.bigdata.service.HostInfService;
import com.bigdata.tools.JsonNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import net.sf.json.JSONObject;

public class HostInfTest {
	
	@Autowired
	private HostInfService hostInfService;
	private ApplicationContext applicationContext = null;
	
	@Before
	public void before() {
		applicationContext  = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		hostInfService = (HostInfService) applicationContext .getBean("hostInfService");
		// System.out.println(hostInfService);
	}

	@Test
	public void testGetHostInfById() {
		HostInf hostInf = hostInfService.getHostInfById(53);
		System.out.println(hostInf);
	}
	
	@Test
	public void testAddHostInf() {
		HostInf hostInf = new HostInf();
		hostInf.setDevIP("192.168.3.27");
		hostInf.setMacAddress("68:ec:c5:0b:30:ff");
		hostInf.setIndicator("PC1");
		hostInf.setDevType("PCINFO");
		hostInf.setMsg("{'param7': '空', 'param6': '空', 'param5': '236.424 GB', 'param4': '7.85 GB', 'param3': 8, 'param2': 'AMD64', 'param1': 'Windows 10', 'param9': '无', 'param8': '无'}");
		
	}
	
	@Test
	public void testGetAllHostInf() {
		List<HostInf> hostInfList = hostInfService.getAllHostInf();
		System.out.println(hostInfList.size());
	}
	
	@Test
	public void testGetHostInfListByEntityForLike() {
		HostInf hostInf = new HostInf();
		hostInf.setDevIP("192.168.1.113");
		List<HostInf> hostInfList = hostInfService.getHostInfListByEntityForLike(hostInf);
		System.out.println(hostInfList.size());
	}
	
	@Test
	public void testUpdateHostInfByEntity() {
		HostInf hostInf = new HostInf();
		hostInf.setHostId(23);
		hostInf.setIndicator("PC2");
		hostInfService.updateHostInfByEntity(hostInf);
		
		System.out.println(hostInfService.getHostInfById(23));
	}
	
	@Test
	public void testReadJson() {
		HostInf hostInf = new HostInf();
		hostInf.setDevIP("127.0.0.1");
		hostInf.setIndicator("PC1");
		List<HostInf> hostInfList = hostInfService.getHostInfByEntityForList(hostInf);
		
		System.out.println(hostInfList.get(hostInfList.size() - 1));
		
		JSONObject jsonObject = JSONObject.fromObject(hostInfList.get(hostInfList.size() - 1).getMsg());
		JsonNode jsonNode = (JsonNode) JSONObject.toBean(jsonObject, JsonNode.class);
		
		System.out.println(jsonNode);
	}
	
	@Test
	public void testReadJson2() {
		Gson gson = new Gson();
		String jsonStr = "[{\"param1\":\"未知\",\"param2\":\"电源断电\",\"param3\":\"11\",\"param4\":\"电池\",\"param5\":\"电源信息\"},{\"param1\":\"运行良好\",\"param2\":\"未知\",\"param3\":\"风扇信息\"},{\"param1\":\"CPU Package-4.21\",\"param2\":\"CPU Graphics-0.0\",\"param3\":\"Bus Speed-100.0\",\"param4\":\"CPU Total-17.2\",\"param5\":\"CPU Core #3-900.0\",\"param6\":\"CPU Core #2-900.0\",\"param7\":\"CPU Core #1-900.0\",\"param8\":\"CPU Cores-2.8\",\"param9\":\"CPU DRAM-0.42\",\"param10\":\"CPU Core #4-900.0\"}]";
		List<JsonNode> jsonList = gson.fromJson(jsonStr, new TypeToken<ArrayList<JsonNode>>(){}.getType());
		
		System.out.println(jsonList);
	}
	
	@Test
	public void test0917_2128() {
		String jsonStr = "1080,123,135,137,138,139,1536,1537,1538,1539,1543,1551,17931,1863,1900,2757,3306,33060,445,4500,46438,47342,47343,500,5040,5050,52028,53386,5353,5355,54094,54436,54437,54438,54439,54440,54441,546,54619,54711,55021,56921,57143,59945,60935,64093,64094,64095,64096,64101,64102,64416,65205,6646,8733";
		
		List<String> resultList = Arrays.asList(jsonStr.split(","));
		
		System.out.println(resultList.get(2));
	}
	
}
