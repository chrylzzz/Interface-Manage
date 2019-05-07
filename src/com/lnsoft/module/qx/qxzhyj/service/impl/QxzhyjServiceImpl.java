package com.lnsoft.module.qx.qxzhyj.service.impl;

import java.util.ArrayList;
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
import com.lnsoft.module.qx.qxzhyj.mapper.QxzhyjMapper;
import com.lnsoft.module.qx.qxzhyj.pojo.Qxzhyjvisit;
import com.lnsoft.module.qx.qxzhyj.service.QxzhyjService;

@WebService
@Service
public class QxzhyjServiceImpl implements QxzhyjService {

	@Autowired
	private QxzhyjMapper qxzhyjMapper;

	@Override
	public ArrayList<HashMap<String, Object>> mapperQueryAllById(String tableName, String objId) {
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		return qxzhyjMapper.mapperQueryAllById(map);
	}

	@Override
	public ArrayList<HashMap<String, Object>> mapperQueryAll(String tableName, String objId) {
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		return (ArrayList) qxzhyjMapper.mapperQueryAll(map);
	}

	// 监听
	@Transactional(value = "mybatis_transactionManager", // 这个可以指定是那个事务管理管理器
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	@Override
	public void insertQxzhyjVisit(HashMap<String, Object> visitMap) {
		qxzhyjMapper.insertQxzhyjVisit(visitMap);

	}

	@Override
	public HashMap<String, Object> queryQxzhyjVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Qxzhyjvisit> list = qxzhyjMapper.queryQxzhyjVisitAll();
		PageInfo<Qxzhyjvisit> pi = new PageInfo<>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pi.getTotal());
		map.put("rows", list);
		return (HashMap) map;
	}

	@Override
	public String convertJdbcQueryAllById(String tableName, String objId) {
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_20);
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		ArrayList<HashMap<String, Object>> mapperQueryAllById = qxzhyjMapper.mapperQueryAllById(map);

		String string = "";
		for (int x = 0; x < mapperQueryAllById.size(); x++) {
			HashMap<String, Object> hashMap = mapperQueryAllById.get(x);
			string = hashMap.values().toString();
			System.err.println(string);
		}
		return string;
	}

	@Override
	public String convertJdbcQueryAll(String tableName, String objId) {
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_20);
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		ArrayList<HashMap<String, Object>> mapperQueryAllById = qxzhyjMapper.mapperQueryAll(map);

		String string = "";
		for (int x = 0; x < mapperQueryAllById.size(); x++) {
			HashMap<String, Object> hashMap = mapperQueryAllById.get(x);
			string = hashMap.values().toString();
			System.err.println(string);
		}
		return string;
	}

}
