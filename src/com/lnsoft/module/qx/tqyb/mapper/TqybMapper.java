package com.lnsoft.module.qx.tqyb.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.module.qx.tqyb.pojo.Tqybvisit;

public interface TqybMapper {

	void insertTqybVisit(@Param("params")Map<String, Object> visitMap);

	List<Tqybvisit> queryTqybVisitAll();

}
