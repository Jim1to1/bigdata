package com.bigdata.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.bigdata.beans.MaliciousCode;

@MapperScan
@Repository
public interface MaliciousCodeMapper {

	/**
	 * 通过 codeId 获取数据库表 <MaliciousCode> 信息
	 * @param codeId
	 * @return
	 */
	public MaliciousCode getMaliciousCodeById(Integer codeId);
	
	/**
	 * 通过 MaliciousCode 对象属性筛选数据库表 <MaliciousCode> 信息
	 * @param maliciousCode
	 * @return MaliciousCode 对象列表
	 */
	public List<MaliciousCode> getMaliciousCodeForListByEntity(MaliciousCode maliciousCode);
	
	/**
	 * 获取所有数据库表 <MaliciousCode> 所有信息
	 * @return
	 */
	public List<MaliciousCode> getAllMaliciousCode();
	
	/**
	 * 添加 MaliciousCode 信息
	 * @param maliciousCode
	 * @return
	 */
	public int addMaliciousCode(MaliciousCode maliciousCode);
	
	/**
	 * 通过 codeId 删除数据库表 <MaliciousCode> 指定信息
	 * @param codeId
	 */
	public void deleteMaliciousCodeById(Integer codeId);
	
}
