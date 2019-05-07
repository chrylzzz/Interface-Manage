package com.lnsoft.module.gzlb.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.module.gzlb.pojo.Gzlbvisit;

public interface GzlbMapper {

	ArrayList<HashMap<String, Object>> mapperQueryAllById(@Param("params")Map<String, String> map);

	ArrayList<HashMap<String, Object>> mapperQueryAll(@Param("params")Map<String, String> map);

	void insertGzlbVisit(@Param("params")Map<String, Object> visitMap);

	List<Gzlbvisit> queryGzlbVisitAll();

}
