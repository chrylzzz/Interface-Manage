package com.lnsoft.module.qx.qxlys.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.module.qx.qxlys.pojo.Qxlysvisit;

public interface QxlysMapper {

	void insertQxlysVisit(@Param("params")Map<String, Object> visitMap);

	List<Qxlysvisit> queryQxlysVisitAll();

}
