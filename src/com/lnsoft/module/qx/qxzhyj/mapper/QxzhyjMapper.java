package com.lnsoft.module.qx.qxzhyj.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.module.qx.qxzhyj.pojo.Qxzhyjvisit;

public interface QxzhyjMapper {

	ArrayList<HashMap<String, Object>> mapperQueryAllById(@Param("params")Map<String, String> map);

	ArrayList<HashMap<String, Object>> mapperQueryAll(@Param("params")Map<String, String> map);

	//监听
	void insertQxzhyjVisit(@Param("params")Map<String, Object> visitMap);

	List<Qxzhyjvisit> queryQxzhyjVisitAll();

}
