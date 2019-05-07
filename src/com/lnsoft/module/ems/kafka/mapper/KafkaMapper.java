package com.lnsoft.module.ems.kafka.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.module.ems.kafka.pojo.Kafkavisit;

public interface KafkaMapper {

	void insertKafkaVisit(@Param("params")Map<String, Object> visitMap);

	List<Kafkavisit> queryKafkaVisitAll();

}
