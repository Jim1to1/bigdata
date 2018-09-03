package com.bigdata.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.bigdata.beans.IndustrialProtocol;

@MapperScan
@Repository
public interface IndustrialProtocolMapper {

	/**
	 * 通过 protocolId 获取对应 IndustrialProtocol 对象信息
	 * @param protocolId
	 * @return
	 */
	public IndustrialProtocol getIndustrialProtocolById(Integer protocolId);
	
	/**
	 * 通过 IndustrialProtocol 对象属性筛选 <IndustrialProtocol> 表中信息
	 * @param IndustrialProtocol
	 * @return
	 */
	public IndustrialProtocol getIndustrialProtocolByEntity(IndustrialProtocol industrialProtocol);
	
	/**
	 * 添加 IndustrialProtocol 对象信息并返回主键值
	 * @param IndustrialProtocol
	 * @return
	 */
	public int addIndustrialProtocol(IndustrialProtocol industrialProtocol);
	
	/**
	 * 通过 protocolId 删除指定 IndustrialProtocol 对象
	 * @param protocolId
	 */
	public void deleteIndustrialProtocolById(Integer protocolId);
	
	/**
	 * 获取全部 <IndustrialProtocol> 表中信息
	 * @return
	 */
	public List<IndustrialProtocol> getAllIndustrialProtocol();
	
	/**
	 * 通过 IndustrialProtocol 对象属性模糊查询 IndustrialProtocol 列表
	 * @param IndustrialProtocol
	 * @return
	 */
	public List<IndustrialProtocol> getIndustrialProtocolByEntityForLike(IndustrialProtocol industrialProtocol);
	
	/**
	 * 通过 IndustrialProtocol 对象属性更新 <IndustrialProtocol> 表中信息
	 * @param IndustrialProtocol
	 */
	public void updateIndustrialProtocol(IndustrialProtocol industrialProtocol);
	
}
