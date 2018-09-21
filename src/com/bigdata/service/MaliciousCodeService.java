package com.bigdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.beans.MaliciousCode;
import com.bigdata.dao.MaliciousCodeMapper;


@Service
public class MaliciousCodeService {

	@Autowired
	private MaliciousCodeMapper maliciousCodeMapper;
	
	/**
	 * 获取数据库表 <MaliciousCode> 中所有信息
	 * @return
	 */
	public List<MaliciousCode> getAllaliciousCode() {
		return maliciousCodeMapper.getAllMaliciousCode();
	}

	/**
	 * 通过 codeId 删除数据库表 <MaliciousCode> 指定信息
	 * @param codeId
	 */
	public void deleteMaliciousCodeById(Integer codeId) {
		maliciousCodeMapper.deleteMaliciousCodeById(codeId);
	}

}