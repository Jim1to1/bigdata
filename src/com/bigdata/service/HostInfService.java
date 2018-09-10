package com.bigdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.beans.HostInf;
import com.bigdata.dao.HostInfMapper;

@Service
public class HostInfService {

	@Autowired
	private HostInfMapper hostInfMapper;

	/**
	 * 通过 hostId 获取指定 HostInf 对象
	 * @param hostId
	 * @return
	 */
	public HostInf getHostInfById(Integer hostId) {
		return hostInfMapper.getHostInfById(hostId);
	}

	/**
	 * 通过 hostInf 对象属性查询指定 hostInf 对象
	 * @param hostInf
	 * @return
	 */
	public HostInf getHostInfByEntity(HostInf hostInf) {
		return hostInfMapper.getHostInfByEntity(hostInf);
	}

	/**
	 * 添加 hostInf 到数据库中
	 * @param hostInf
	 * @return
	 */
	public int addHostInf(HostInf hostInf) {
		hostInfMapper.addHostInf(hostInf);
		return hostInf.getHostId();
	}

	/**
	 * 获取所有数据库表中所有 HostInf 信息s
	 * @return
	 */
	public List<HostInf> getAllHostInf() {
		return hostInfMapper.getAllHostInf();
	}

	/**
	 * 通过 hostInf 对象属性模糊查询 hostInf 表中信息
	 * @param hostInf
	 * @return
	 */
	public List<HostInf> getHostInfListByEntityForLike(HostInf hostInf) {
		return hostInfMapper.getHostInfListByEntityForLike(hostInf);
	}

	/**
	 * 更新 HostInf 数据库表中信息
	 * @param hostInf
	 */
	public void updateHostInfByEntity(HostInf hostInf) {
		hostInfMapper.updateHostInfByEntity(hostInf);
	}
	
}
