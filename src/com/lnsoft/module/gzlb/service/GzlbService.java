package com.lnsoft.module.gzlb.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.jws.WebService;
@WebService
public interface GzlbService {

	ArrayList<HashMap<String, Object>> mapperQueryAllById(String tableName, String objId);
	
	ArrayList<HashMap<String, Object>> mapperQueryAll(String tableName, String objId);

	//对外
	void insertGzlbVisit(HashMap<String, Object> visitMap);

	HashMap<String, Object> queryGzlbVisitAll(Integer page, Integer rows);
	
	//ws
	String convertJdbcQueryAllById(String tableName, String objId);
	String convertJdbcQueryAll(String tableName, String objId);
}
