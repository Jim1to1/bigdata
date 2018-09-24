package com.bigdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.beans.ScanData;
import com.bigdata.dao.ScanDataMapper;

@Service
public class ScanDataService {

	@Autowired
	private ScanDataMapper scanDataMapper;

	/**
	 * 通过 scanId 获取指定 ScanData 对象
	 * @param scanId
	 * @return
	 */
	public ScanData getScanDataById(Integer scanId) {
		return scanDataMapper.getScanDataById(scanId);
	}

	/**
	 * 添加 ScanData 信息
	 * @param scanData
	 * @return
	 */
	public int insertScanData(ScanData scanData) {
		scanDataMapper.addScanData(scanData);
		return scanData.getScanId();
	}
	
	/**
	 * 获取所有 ScanData 对象信息
	 * @return
	 */
	public List<ScanData> getAllScanData() {
		return scanDataMapper.getAllScanData();
	}
	
	/**
	 * 通过 ScanData 对象模糊查询数据库表 <ScanData> 中信息
	 * @param scanData
	 * @return
	 */
	public List<ScanData> getScanDataByEntityForLike(ScanData scanData) {
		return scanDataMapper.getScanDataByEntityForLike(scanData);
	}
	
	/**
	 * 通过 ScanData 对象精准查询数据库表 <ScanData> 中信息
	 * @param scanData
	 * @return
	 */
	public List<ScanData> getScanDataByEntityForList(ScanData scanData) {
		return scanDataMapper.getScanDataByEntityForList(scanData);
	}
	
	/**
	 * 通过 ScanData 对象属性更新数据库表中信息
	 * @param scanData
	 */
	public void updateScanDataByEntity(ScanData scanData) {
		if(scanData.getScanId() != null) {
			scanDataMapper.updateScanDataByEntity(scanData);
		}
	}
	
}
