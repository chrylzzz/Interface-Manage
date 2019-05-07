package com.lnsoft.module.fdc.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lnsoft.commons.dynamicDataSource.DataSourceConst;
import com.lnsoft.commons.dynamicDataSource.DataSourceContextHolder;
import com.lnsoft.module.fdc.mapper.FdcMapper;
import com.lnsoft.module.fdc.pojo.Fdcvisit;
import com.lnsoft.module.fdc.service.FdcService;

@WebService
@Service
public class FdcServiceImpl implements FdcService {

	@Autowired
	private FdcMapper fdcMapper;

	@Override
	public ArrayList<HashMap<String, String>> queryFdcByInnerfragment(Integer ment) {
		return fdcMapper.queryFdcByInnerfragment(ment);
	}

	@Override
	public HashMap<String, Object> queryFdcVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		ArrayList<Fdcvisit> ArrayList = (ArrayList) fdcMapper.queryFdcVisitAll();
		PageInfo<Fdcvisit> pi = new PageInfo<>(ArrayList);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pi.getTotal());
		map.put("rows", ArrayList);
		return (HashMap) map;
	}

	@Override
	public void insertFdcVisit(HashMap<String, Object> visitMap) {
		fdcMapper.insertFdcVisit(visitMap);
	}

	@Override
	public String convertJdbcQueryAllById(String ment) {
		Integer newMent = Integer.valueOf(ment);
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_20);
		ArrayList<HashMap<String, String>> queryFdcByInnerfragment = fdcMapper.queryFdcByInnerfragment(newMent);
		
		String string = "";
		for (int x = 0; x < queryFdcByInnerfragment.size(); x++) {
			HashMap<String, String> hashMap = queryFdcByInnerfragment.get(x);
			string = hashMap.values().toString();
			System.err.println(string);
		}
		return string;
	}

	@Override
	public String convertJdbcQueryAll() {
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_20);
		ArrayList<HashMap<String, String>> queryFdcByInnerfragment = fdcMapper.queryFdcByInnerfrag();
		
		String string = "";
		for (int x = 0; x < queryFdcByInnerfragment.size(); x++) {
			HashMap<String, String> hashMap = queryFdcByInnerfragment.get(x);
			string = hashMap.values().toString();
			System.err.println(string);
		}
		return string;
	}
}
