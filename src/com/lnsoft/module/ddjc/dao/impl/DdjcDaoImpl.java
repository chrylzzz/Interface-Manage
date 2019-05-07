package com.lnsoft.module.ddjc.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lnsoft.commons.selectMap.SelectOutMap;
import com.lnsoft.module.ddjc.dao.DdjcDao;

@Repository
public class DdjcDaoImpl implements DdjcDao {

	@Autowired
	private JdbcTemplate jt;

	@Override
	public ArrayList<HashMap<String, Object>> jdbcQueryAllById(String tableName, String objId) {
		// if(tableName.equals("_DATA")){
		// String sql="select * from "+tableName+" where
		// "+SelectOutMap.selectOutMap.get(tableName)+" = '"+SJID+"'";
		// }
		// if(tableName.equals("_BASE")){
		// String sql="select * from "+tableName+" where
		// "+SelectOutMap.selectOutMap.get(tableName)+" = '"+YSJL_ID+"'";
		// }
		String sql = "select * from " + tableName + " where " + SelectOutMap.selectOutMap.get(tableName) + " = '"
				+ objId + "'";
		return (ArrayList) jt.queryForList(sql);
	}

	@Override
	public ArrayList<HashMap<String, Object>> jdbcQueryAll(String tableName) {
		String sql = "select * from " + tableName;
		return (ArrayList) jt.queryForList(sql);
	}

	@Override
	public ArrayList<String> convertJdbcQueryAllById(String tableName, String objId) {
		String sql = "select * from " + tableName + " where " + SelectOutMap.selectOutMap.get(tableName) + " = '"
				+ objId + "'";
		return (ArrayList)jt.queryForList(sql);
	}

}
