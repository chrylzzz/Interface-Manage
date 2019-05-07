package com.lnsoft.module.sbdzxjc.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.module.sbdzxjc.pojo.Sbdzxjcinvisit;
import com.lnsoft.module.sbdzxjc.pojo.Sbdzxjcvisit;

public interface SbdzxjcMapper {

	ArrayList<HashMap<String, Object>> mapperQueryAllById(@Param("params") Map<String, String> map);

	ArrayList<HashMap<String, Object>> mapperQueryAll(@Param("params") Map<String, String> map);

	List<Map<String, Object>> queryTableHaveTSById(@Param("objId") String objId);

	List<Map<String, Object>> queryTableHaveTS();

	//
	void insertSbdzxjcVisit(@Param("params") Map<String, Object> visitMap);

	List<Sbdzxjcvisit> querySbdzxjcVisitAll();

	void insertSbdzxjcInVisit(@Param("params") Map<String, Object> visitMap);

	List<Sbdzxjcinvisit> querySbdzxjcInVisitAll();

}
