package com.lnsoft.module.fdc.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.module.fdc.pojo.Fdcvisit;

public interface FdcMapper {
	
	ArrayList<HashMap<String,String>> queryFdcByInnerfragment(@Param("ment") Integer ment);

	List<Fdcvisit> queryFdcVisitAll();

	void insertFdcVisit(@Param("params")Map<String, Object> visitMap);

	ArrayList<HashMap<String,String>> queryFdcByInnerfrag();
}
