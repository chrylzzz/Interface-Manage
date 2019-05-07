package com.lnsoft.module.sbdzxjc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;
@WebService
public interface SbdzxjcService {

	ArrayList<HashMap<String, Object>> mapperQueryAllById(String tableName, String objId);

	ArrayList<HashMap<String, Object>> mapperQueryAll(String tableName, String objId);

	ArrayList<HashMap<String, Object>> queryTableHaveTSById(String objId);
	
	ArrayList<HashMap<String, Object>> queryTableHaveTS();

	//监听wai
	void insertSbdzxjcVisit(HashMap<String, Object> visitMap);

	HashMap<String, Object> querySbdzxjcVisitAll(Integer page, Integer rows);
//nei
	HashMap<String, Object> querySbdzxjcInVisitInAll(Integer page, Integer rows);

	void insertSbdzxjcInVisit(HashMap<String, Object> visitMap);
	
	//ws
	String convertJdbcQueryAllById(String tableName, String objId);
	String convertJdbcQueryAll(String tableName, String objId);	
}
