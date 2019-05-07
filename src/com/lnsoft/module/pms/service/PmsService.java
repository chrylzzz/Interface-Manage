package com.lnsoft.module.pms.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.jws.WebService;

@WebService
public interface PmsService {

	//根据表和id
	ArrayList<HashMap<String, Object>> mapperQueryAllById(String tableName, String objId);
	//根据表查
	ArrayList<HashMap<String, Object>> mapperQueryAll(String tableName, String objId);
	/**
	 * 对外监听的方法
	 * @param visitMap
	 */
	void insertPmsVisit(HashMap<String, Object> visitMap);
	HashMap<String, Object> queryPmsVisitAll(Integer page, Integer rows);
	//对内
	void insertPmsInVisit(HashMap<String, Object> visitMap);
	HashMap<String, Object> queryPmsInVisitAll(Integer page, Integer rows);
	int queryCountByPMS();

	//ws
	String convertMapperQueryAllById(String tableName, String objId);
	String convertMapperQueryAll(String tableName, String objId);
}
