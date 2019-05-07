package com.lnsoft.module.ddjc.dao;

import java.util.ArrayList;
import java.util.HashMap;

public interface DdjcDao {

	ArrayList<HashMap<String, Object>> jdbcQueryAllById(String tableName, String objId);

	ArrayList<HashMap<String, Object>> jdbcQueryAll(String tableName);

	ArrayList<String> convertJdbcQueryAllById(String tableName, String objId);
	
	

}
