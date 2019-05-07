package com.lnsoft.module.pms.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lnsoft.commons.dynamicDataSource.DataSourceConst;
import com.lnsoft.commons.dynamicDataSource.DataSourceContextHolder;
import com.lnsoft.module.pms.mapper.PmsMapper;
import com.lnsoft.module.pms.pojo.Pmsinvisit;
import com.lnsoft.module.pms.pojo.Pmsvisit;
import com.lnsoft.module.pms.service.PmsService;

@WebService
@Service
public class PmsServiceImpl implements PmsService {

	@Autowired
	private PmsMapper pmsMapper;

	@Override
	public ArrayList<HashMap<String, Object>> mapperQueryAllById(String tableName, String objId) {
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		ArrayList<HashMap<String, Object>> mapperQueryAllById = pmsMapper.mapperQueryAllById(map);
		return mapperQueryAllById;
	}

	@Override
	public ArrayList<HashMap<String, Object>> mapperQueryAll(String tableName, String objId) {
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		return pmsMapper.mapperQueryAll(map);
	}

	// 对外
	/**
	 * 页面监测
	 */
	@Transactional(value = "mybatis_transactionManager", // 这个可以指定是那个事务管理管理器
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	public void insertPmsVisit(HashMap<String, Object> map) {
		pmsMapper.insertPmsVisit(map);
	}

	/**
	 * easyui:返回给后台page 当前页 rows 每页记录数 返回给datagrid页面：total 总记录数 rows 每页记录数
	 */
	public HashMap<String, Object> queryPmsVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Pmsvisit> list = pmsMapper.queryPmsVisitAll();
		PageInfo<Pmsvisit> pi = new PageInfo<>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pi.getTotal());
		map.put("rows", list);
		return (HashMap) map;
	}

	// 对内
	@Transactional(value = "mybatis_transactionManager", // 这个可以指定是那个事务管理管理器
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	@Override
	public void insertPmsInVisit(HashMap<String, Object> visitMap) {
		pmsMapper.insertPmsInVisit(visitMap);
	}

	@Override
	public HashMap<String, Object> queryPmsInVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Pmsinvisit> list = pmsMapper.queryPmsInVisitAll();
		PageInfo<Pmsinvisit> pi = new PageInfo<>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pi.getTotal());
		map.put("rows", list);
		return (HashMap) map;
	}

	@Override
	public int queryCountByPMS() {
		return pmsMapper.queryCountByPMS();
	}

	@Override
	public String convertMapperQueryAllById(String tableName, String objId) {
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_18);
		ArrayList<HashMap<String, Object>> mapperQueryAllById = pmsMapper.mapperQueryAllById(map);
		String string = "";
		for (int x = 0; x < mapperQueryAllById.size(); x++) {
			HashMap<String, Object> hashMap = mapperQueryAllById.get(x);
			string = hashMap.values().toString();
			System.err.println(string);
		}
		return string;
	}

	@Override
	public String convertMapperQueryAll(String tableName, String objId) {
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_18);
		ArrayList<HashMap<String, Object>> mapperQueryAllById = pmsMapper.mapperQueryAll(map);
		String string = "";
		for (int x = 0; x < mapperQueryAllById.size(); x++) {
			HashMap<String, Object> hashMap = mapperQueryAllById.get(x);
			string = hashMap.values().toString();
			System.err.println(string);
		}
		return string;
	}

}
