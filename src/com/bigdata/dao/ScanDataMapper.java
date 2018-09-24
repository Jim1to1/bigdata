package com.bigdata.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.bigdata.beans.ScanData;

@MapperScan
@Repository
public interface ScanDataMapper {

	/**
	 * 通过 scanId 获取 <ScanData> 表中 ScanData 对象信息
	 * @param scanId
	 * @return
	 */
	public ScanData getScanDataById(Integer scanId);
	
	/**
	 * 通过 ScanData 属性获取 <ScanData> 表中 ScanData 对象信息
	 * @param scanData
	 * @return
	 */
	public ScanData getScanDataByEntity(ScanData scanData);
	
	/**
	 * 向 <ScanData> 表中添加 ScanData 对象信息并返回主键
	 * @param scanData
	 * @return
	 */
	public int addScanData(ScanData scanData);
	
	/**
	 * 通过 scanId 删除 ScanData 对象信息
	 * @param scanId
	 */
	public void deleteScanDataById(Integer scanId);

	/**
	 * 获取 <ScanData> 表中所有 ScanData 信息
	 * @return
	 */
	public List<ScanData> getAllScanData();
	
	/**
	 * scanData 对象信息模糊查询 <ScanData> 表中信息, 返回符合要求的 ScanData 对象列表
	 * @param scanData
	 * @return
	 */
	public List<ScanData> getScanDataByEntityForLike(ScanData scanData);
	
	/**
	 * 通过 ScanData 对象属性更新 <ScanData> 表中信息
	 * @param scanData
	 */
	public void updateScanDataByEntity(ScanData scanData);
	
	/**
	 * 通过 scanData 对象信息精准查询 <ScanData> 表中信息
	 * @param scanData
	 * @return
	 */
	public List<ScanData> getScanDataByEntityForList(ScanData scanData);
	
}
