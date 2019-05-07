package com.lnsoft.module.ld.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.module.ld.pojo.Ldvisit;

public interface LdMapper {

	void insertLdVisit(@Param("params")Map<String, Object> visitMap);

	List<Ldvisit> queryLdVisitAll();

}
