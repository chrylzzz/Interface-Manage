package com.lnsoft.module.qx.qxlys.service;

import java.util.Map;

public interface QxlysService {

	//对外
	void insertQxlysVisit(Map<String, Object> visitMap);

	Map<String, Object> queryQxlysVisitAll(Integer page, Integer rows);

}
