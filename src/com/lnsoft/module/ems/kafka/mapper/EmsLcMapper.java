package com.lnsoft.module.ems.kafka.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

//量测类型得到keyid
public interface EmsLcMapper {

	ArrayList<String> queryLcType(@Param("lcType") String lcType//
			/*,@Param("city") String city*/);

	void insertKafkaVisit(@Param("params") Map<String, Object> visitMap);
}
