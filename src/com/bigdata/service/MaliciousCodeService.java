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
	public List<MaliciousCode> getAllMaliciousCode() {
		return maliciousCodeMapper.getAllMaliciousCode();
	}

	/**
	 * 通过 codeId 删除数据库表 <MaliciousCode> 指定信息
	 * @param codeId
	 */
	public void deleteMaliciousCodeById(Integer codeId) {
		maliciousCodeMapper.deleteMaliciousCodeById(codeId);
	}

	/**
	 * 通过 maliciousCode 向数据库表<MaliciousCode>中添加信息
	 * @param maliciousCode
	 * @return
	 */
	public Integer addMaliciousCodeByEntity(MaliciousCode maliciousCode) {
		return maliciousCodeMapper.addMaliciousCode(maliciousCode);
	}
	
	/**
	 * 判断 codeName 是否在数据库中存在
	 * @param codeName
	 * @return
	 */
	public boolean codeNameIsExist(String codeName) {
		MaliciousCode maliciousCode = new MaliciousCode();
		maliciousCode.setCodeName(codeName);
		
		if(maliciousCodeMapper.getMaliciousCodeForListByEntity(maliciousCode) != null) {
			return true;
		}
		
		return false;
	}

}
