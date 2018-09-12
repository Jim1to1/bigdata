package com.bigdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.beans.IndustrialProtocol;
import com.bigdata.dao.IndustrialProtocolMapper;

@Service
public class IndustrialProtocolService {

	@Autowired
	private IndustrialProtocolMapper industrialProtocolMapper;

	/**
	 * 通过 protocolId 获取指定 IndustrialProtocol 信息
	 * @param protocolId
	 * @return
	 */
	public IndustrialProtocol getIndustrialProtocolById(Integer protocolId) {
		return industrialProtocolMapper.getIndustrialProtocolById(protocolId);
	}

	/**
	 * 添加 industrialProtocol 信息
	 * @param industrialProtocol
	 * @return
	 */
	public int insertIndustrialProtocol(IndustrialProtocol industrialProtocol) {
		industrialProtocolMapper.addIndustrialProtocol(industrialProtocol);
		return industrialProtocol.getProtocolId();
	}
	
}
