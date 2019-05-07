package com.lnsoft.module.qx.tqyb.service;

import java.util.Map;

public interface TqybService {

	//duiwai
	void insertTqybVisit(Map<String, Object> visitMap);

	Map<String, Object> queryTqybVisitAll(Integer page, Integer rows);

	

}
