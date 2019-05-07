package com.lnsoft.module.ddjc.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.jws.WebService;

@WebService
public interface DdjcService {

	ArrayList<HashMap<String, Object>> jdbcQueryAllById(String tableName, String objId);

	ArrayList<HashMap<String, Object>> jdbcQueryAll(String tableName);

	//监听对外
	void insertDdjcVisit(HashMap<String, Object> visitMap);

	HashMap<String, Object> queryDdjcVisitAll(Integer page, Integer rows);

	//对内
	void insertDdjcInVisit(HashMap<String, Object> visitMap);
	HashMap<String, Object> queryDdjcInVisitAll(Integer page, Integer rows);


	//ws
	String convertJdbcQueryAllById(String tableName, String objId);
	String convertJdbcQueryAll(String tableName, String objId);
}
