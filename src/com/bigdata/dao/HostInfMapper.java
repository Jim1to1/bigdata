package com.bigdata.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.bigdata.beans.HostInf;

@MapperScan
@Repository
public interface HostInfMapper {

	/**
	 * 通过 hostId 获取 HostInf 对象
	 * @param hostId
	 * @return
	 */
	public HostInf getHostInfById(Integer hostId);
	
	/**
	 * 通过 hostInf 对象实体属性筛选获取 HostInf 表中信息
	 * @param hostInf
	 * @return
	 */
	public List<HostInf> getHostInfByEntityForList(HostInf hostInf);
	
	/**
	 * 添加 HostInf 信息
	 * @param hostInf
	 * @return
	 */
	public int addHostInf(HostInf hostInf);
	
	/**
	 * 通过 hostId 删除 HostInf 对象信息
	 * @param hostId
	 */
	public void deleteHostInfById(Integer hostId);
	
	/**
	 * 获取 <HostInf> 表中所有 HostInf 信息
	 * @return
	 */
	public List<HostInf> getAllHostInf();
	
	/**
	 * 通过 HostInf 对象属性模糊查询 <HostInf> 表中对象信息
	 * @param hostInf
	 * @return
	 */
	public List<HostInf> getHostInfListByEntityForLike(HostInf hostInf);
	
	/**
	 * 通过 hostInf 对象属性更新 <hostInf> 表中信息 (hostInf 对象中需带有 hostId, 否则更新无效)
	 * @param hostInf
	 */
	public void updateHostInfByEntity(HostInf hostInf);
	
	/**
	 * 通过 hostInf 属性精准查询最后一个 hostInf 信息
	 * @param hostInf
	 * @return
	 */
	public HostInf getLastHostInfByEntity(HostInf hostInf);
	
}
