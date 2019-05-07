package com.lnsoft.module.gzlb.service.impl;

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
import com.lnsoft.module.gzlb.mapper.GzlbMapper;
import com.lnsoft.module.gzlb.pojo.Gzlbvisit;
import com.lnsoft.module.gzlb.service.GzlbService;

@WebService
@Service
public class GzlbServiceImpl implements GzlbService {

	@Autowired
	private GzlbMapper gzlbMapper;

	@Override
	public ArrayList<HashMap<String, Object>> mapperQueryAllById(String tableName, String objId) {
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		return gzlbMapper.mapperQueryAllById(map);

	}

	@Override
	public ArrayList<HashMap<String, Object>> mapperQueryAll(String tableName, String objId) {
		Map<String, String> map = new HashMap<>();
		map.put(tableName, objId);
		return (ArrayList) gzlbMapper.mapperQueryAll(map);
	}

	@Transactional(value = "mybatis_transactionManager", //
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	@Override
	public void insertGzlbVisit(HashMap<String, Object> visitMap) {
		gzlbMapper.insertGzlbVisit(visitMap);

	}

	@Override
	public HashMap<String, Object> queryGzlbVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Gzlbvisit> list = gzlbMapper.queryGzlbVisitAll();
		PageInfo<Gzlbvisit> pi = new PageInfo<>(list);
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
		ArrayList<HashMap<String, Object>> mapperQueryAllById = gzlbMapper.mapperQueryAllById(map);

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
		ArrayList<HashMap<String, Object>> mapperQueryAllById = gzlbMapper.mapperQueryAll(map);

		String string = "";
		for (int x = 0; x < mapperQueryAllById.size(); x++) {
			HashMap<String, Object> hashMap = mapperQueryAllById.get(x);
			string = hashMap.values().toString();
			System.err.println(string);
		}
		return string;
	}

}
