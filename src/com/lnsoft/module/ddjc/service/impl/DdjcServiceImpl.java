package com.lnsoft.module.ddjc.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
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
import com.lnsoft.module.ddjc.dao.DdjcDao;
import com.lnsoft.module.ddjc.mapper.DdjcMapper;
import com.lnsoft.module.ddjc.pojo.Ddjcinvisit;
import com.lnsoft.module.ddjc.pojo.Ddjcvisit;
import com.lnsoft.module.ddjc.service.DdjcService;

/**
 * 
 * @author Administrator
 * 
 *         表名后缀为：_BASE，如DDJC_HWRXJC_BASE，表主键为YSJL_ID
 *         表名后缀为：_DATA，如DDJC_HWRXJC_DATA，表主键为SJID
 */
@WebService
@Service
public class DdjcServiceImpl implements DdjcService {

	@Autowired
	private DdjcDao ddjcDao;
	@Autowired
	private DdjcMapper ddjcMapper;

	@Override
	public ArrayList<HashMap<String, Object>> jdbcQueryAllById(String tableName, String objId) {

		return ddjcDao.jdbcQueryAllById(tableName, objId);
	}

	@Override
	public ArrayList<HashMap<String, Object>> jdbcQueryAll(String tableName) {

		return ddjcDao.jdbcQueryAll(tableName);
	}

	@Transactional(value = "mybatis_transactionManager", // 这个可以指定是那个事务管理管理器
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	@Override
	public void insertDdjcVisit(HashMap<String, Object> visitHashMap) {
		ddjcMapper.insertDdjcVisit(visitHashMap);
	}

	@Override
	public HashMap<String, Object> queryDdjcVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		ArrayList<Ddjcvisit> ArrayList = (ArrayList) ddjcMapper.queryDdjcVisitAll();
		PageInfo<Ddjcvisit> pi = new PageInfo<>(ArrayList);
		HashMap<String, Object> HashMap = new HashMap<String, Object>();
		HashMap.put("total", pi.getTotal());
		HashMap.put("rows", ArrayList);
		return HashMap;
	}

	@Transactional(value = "mybatis_transactionManager", // 这个可以指定是那个事务管理管理器
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	@Override
	public void insertDdjcInVisit(HashMap<String, Object> visitHashMap) {
		ddjcMapper.insertDdjcInVisit(visitHashMap);

	}

	@Override
	public HashMap<String, Object> queryDdjcInVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		ArrayList<Ddjcinvisit> ArrayList = (ArrayList) ddjcMapper.queryDdjcInVisitAll();
		PageInfo<Ddjcinvisit> pi = new PageInfo<>(ArrayList);
		HashMap<String, Object> HashMap = new HashMap<String, Object>();
		HashMap.put("total", pi.getTotal());
		HashMap.put("rows", ArrayList);
		return HashMap;
	}

	@Override
	public String convertJdbcQueryAllById(String tableName, String objId) {
		String string = "";
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_13);
		if (tableName.toUpperCase().contains("_BASE")) {
			Map<String, String> map = new HashMap<>();
			map.put(tableName, objId);
			ArrayList<HashMap<String, Object>> jdbcQueryAllById = ddjcMapper.mapperQueryAllById(map);
			for (int x = 0; x < jdbcQueryAllById.size(); x++) {
				HashMap<String, Object> hashMap = jdbcQueryAllById.get(x);
				string = hashMap.values().toString();
				System.err.println(string);
			}
		}
		if (tableName.toUpperCase().contains("_DATA")) {
			Map<String, String> map = new HashMap<>();
			map.put(tableName, objId);
			ArrayList<HashMap<String, Object>> jdbcQueryAllById = ddjcMapper.mapperQueryAllById2(map);

			for (int x = 0; x < jdbcQueryAllById.size(); x++) {
				HashMap<String, Object> hashMap = jdbcQueryAllById.get(x);
				string = hashMap.values().toString();
				System.err.println(string);
			}

		}
		return string;
	}
	
	@Override
	public String convertJdbcQueryAll(String tableName, String objId) {
		String string = "";
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_13);
		if (tableName.toUpperCase().contains("_BASE")) {
			Map<String, String> map = new HashMap<>();
			map.put(tableName, objId);
			ArrayList<HashMap<String, Object>> jdbcQueryAllById = ddjcMapper.mapperQueryAll(map);
			for (int x = 0; x < jdbcQueryAllById.size(); x++) {
				HashMap<String, Object> hashMap = jdbcQueryAllById.get(x);
				string = hashMap.values().toString();
				System.err.println(string);
			}
		}
		return string;
	}
	
	
}
