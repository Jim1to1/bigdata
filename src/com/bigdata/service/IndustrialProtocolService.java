package com.bigdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.beans.IndustrialProtocol;
import com.bigdata.dao.IndustrialProtocolMapper;

@Service
public class IndustrialProtocolService {

	@Autowired
	private IndustrialProtocolMapper industrialProtocolMapper;

	/**
	 * 通过 protocolId 获取对应 IndustrialProtocol 对象信息
	 * 
	 * @param protocolId
	 * @return
	 */
	public IndustrialProtocol getIndustrialProtocolById(Integer protocolId) {
		return industrialProtocolMapper.getIndustrialProtocolById(protocolId);
	}
	/**
	 * 通过 IndustrialProtocol 对象属性筛选 <IndustrialProtocol> 表中信息
	 * 
	 * @param IndustrialProtocol
	 * @return
	 */
	// public IndustrialProtocol getIndustrialProtocolByEntity(IndustrialProtocol
	// industrialProtocol) {
	//
	// }

	/**
	 * 添加 IndustrialProtocol 对象信息并返回主键值
	 * 
	 * @param IndustrialProtocol
	 * @return
	 */
	public int addIndustrialProtocol(IndustrialProtocol industrialProtocol) {
		return industrialProtocolMapper.addIndustrialProtocol(industrialProtocol);
	}

	/**
	 * 通过 protocolId 删除指定 IndustrialProtocol 对象
	 * 
	 * @param protocolId
	 */
	public void deleteIndustrialProtocolById(Integer protocolId) {
		industrialProtocolMapper.deleteIndustrialProtocolById(protocolId);
	}

	/**
	 * 获取全部 <IndustrialProtocol> 表中信息
	 * 
	 * @return
	 */
	public List<IndustrialProtocol> getAllIndustrialProtocol() {
		return industrialProtocolMapper.getAllIndustrialProtocol();
	}

	/**
	 * 通过 IndustrialProtocol 对象属性模糊查询 IndustrialProtocol 列表
	 * 
	 * @param IndustrialProtocol
	 * @return
	 */
	public List<IndustrialProtocol> getIndustrialProtocolByEntityForLike(IndustrialProtocol industrialProtocol) {
		return industrialProtocolMapper.getIndustrialProtocolByEntityForLike(industrialProtocol);
	}

	/**
	 * 通过 IndustrialProtocol 对象属性更新 <IndustrialProtocol> 表中信息
	 * 
	 * @param IndustrialProtocol
	 */
	public void updateIndustrialProtocol(IndustrialProtocol industrialProtocol) {
		if (industrialProtocol.getProtocolId() != null) {
			industrialProtocolMapper.updateIndustrialProtocol(industrialProtocol);
		}
	}

}
