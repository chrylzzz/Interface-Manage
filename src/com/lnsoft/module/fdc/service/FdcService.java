package com.lnsoft.module.fdc.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.jws.WebService;

@WebService
public interface FdcService {
	ArrayList<HashMap<String,String>> queryFdcByInnerfragment(Integer ment);

	HashMap<String, Object> queryFdcVisitAll(Integer page, Integer rows);

	void insertFdcVisit(HashMap<String, Object> visitHashMap);
	
	String convertJdbcQueryAllById(String ment);
	String convertJdbcQueryAll();
}
