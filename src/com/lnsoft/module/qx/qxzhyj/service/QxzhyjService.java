package com.lnsoft.module.qx.qxzhyj.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.jws.WebService;
@WebService
public interface QxzhyjService {

	ArrayList<HashMap<String, Object>> mapperQueryAll(String tableName, String objId);

	ArrayList<HashMap<String, Object>> mapperQueryAllById(String tableName, String objId);

	//监听
	void insertQxzhyjVisit(HashMap<String, Object> visitMap);

	HashMap<String, Object> queryQxzhyjVisitAll(Integer page, Integer rows);
	//ws
	String convertJdbcQueryAllById(String tableName, String objId);
	String convertJdbcQueryAll(String tableName, String objId);
}
