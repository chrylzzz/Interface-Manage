package com.lnsoft.module.sbdzxjc.service.impl;

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
import com.lnsoft.module.sbdzxjc.mapper.SbdzxjcMapper;
import com.lnsoft.module.sbdzxjc.pojo.Sbdzxjcinvisit;
import com.lnsoft.module.sbdzxjc.pojo.Sbdzxjcvisit;
import com.lnsoft.module.sbdzxjc.service.SbdzxjcService;
@WebService
@Service
public class SbdzxjcServiceImpl implements SbdzxjcService {

	@Autowired
	private SbdzxjcMapper sbdzxjcMapper;

	@Override
	public ArrayList<HashMap<String, Object>> mapperQueryAllById(String tableName, String objId) {
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		return sbdzxjcMapper.mapperQueryAllById(map);
	}

	@Override
	public ArrayList<HashMap<String, Object>> mapperQueryAll(String tableName, String objId) {
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		return (ArrayList)sbdzxjcMapper.mapperQueryAll(map);
	}

	@Override
	public ArrayList<HashMap<String, Object>> queryTableHaveTSById(String objId) {
		return (ArrayList)sbdzxjcMapper.queryTableHaveTSById(objId);
	}

	@Override
	public ArrayList<HashMap<String, Object>> queryTableHaveTS() {
		return (ArrayList)sbdzxjcMapper.queryTableHaveTS();
	}

	// 监听
	@Transactional(value = "mybatis_transactionManager", // 这个可以指定是那个事务管理管理器
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	@Override
	public void insertSbdzxjcVisit(HashMap<String, Object> visitMap) {
		sbdzxjcMapper.insertSbdzxjcVisit(visitMap);

	}

	@Override
	public HashMap<String, Object> querySbdzxjcVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Sbdzxjcvisit> list = sbdzxjcMapper.querySbdzxjcVisitAll();
		PageInfo<Sbdzxjcvisit> pi = new PageInfo<>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pi.getTotal());
		map.put("rows", list);
		return (HashMap)map;
	}

	@Transactional(value = "mybatis_transactionManager", // 这个可以指定是那个事务管理管理器
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	@Override
	public void insertSbdzxjcInVisit(HashMap<String, Object> visitMap) {
		sbdzxjcMapper.insertSbdzxjcInVisit(visitMap);
	}

	@Override
	public HashMap<String, Object> querySbdzxjcInVisitInAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Sbdzxjcinvisit> list = sbdzxjcMapper.querySbdzxjcInVisitAll();
		PageInfo<Sbdzxjcinvisit> pi = new PageInfo<>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pi.getTotal());
		map.put("rows", list);
		return (HashMap)map;
	}

	@Override
	public String convertJdbcQueryAllById(String tableName, String objId) {
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_48);
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		ArrayList<HashMap<String, Object>> mapperQueryAllById = sbdzxjcMapper.mapperQueryAllById(map);

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
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_48);
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		ArrayList<HashMap<String, Object>> mapperQueryAllById = sbdzxjcMapper.mapperQueryAll(map);

		String string = "";
		for (int x = 0; x < mapperQueryAllById.size(); x++) {
			HashMap<String, Object> hashMap = mapperQueryAllById.get(x);
			string = hashMap.values().toString();
			System.err.println(string);
		}
		return string;
	}

}
