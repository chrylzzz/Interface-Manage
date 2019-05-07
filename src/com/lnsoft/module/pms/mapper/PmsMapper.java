package com.lnsoft.module.pms.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.module.pms.pojo.Pmsinvisit;
import com.lnsoft.module.pms.pojo.Pmsvisit;

public interface PmsMapper {

	ArrayList<HashMap<String, Object>> mapperQueryAllById(@Param("params") Map<String, String> map);

	ArrayList<HashMap<String, Object>> mapperQueryAll(@Param("params") Map<String, String> map);

	// 监听的
	void insertPmsVisit(@Param("params") Map<String, Object> map);

	List<Pmsvisit> queryPmsVisitAll();

	// 对内
	void insertPmsInVisit(@Param("params")Map<String, Object> visitMap);

	List<Pmsinvisit> queryPmsInVisitAll();

	int queryCountByPMS();
	
	//List<HashMap<String, String>> convertMapperQueryAllById(@Param("params") Map<String, String> map);
}
