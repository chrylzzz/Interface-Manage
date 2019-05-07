package com.lnsoft.module.ddjc.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.module.ddjc.pojo.Ddjcinvisit;
import com.lnsoft.module.ddjc.pojo.Ddjcvisit;

public interface DdjcMapper {

	void insertDdjcVisit(@Param("params")Map<String, Object> visitMap);

	List<Ddjcvisit> queryDdjcVisitAll();

	void insertDdjcInVisit(@Param("params")Map<String, Object> visitMap);

	List<Ddjcinvisit> queryDdjcInVisitAll();

	//ws
	ArrayList<HashMap<String, Object>> mapperQueryAllById(@Param("params") Map<String, String> map);

	ArrayList<HashMap<String, Object>> mapperQueryAllById2(@Param("params") Map<String, String> map);

	ArrayList<HashMap<String, Object>> mapperQueryAll(@Param("params")Map<String, String> map);


}
