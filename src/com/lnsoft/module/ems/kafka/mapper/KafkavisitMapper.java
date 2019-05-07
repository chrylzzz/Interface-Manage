package com.lnsoft.module.ems.kafka.mapper;

import com.lnsoft.module.ems.kafka.pojo.Kafkavisit;
import com.lnsoft.module.ems.kafka.pojo.KafkavisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KafkavisitMapper {
    int countByExample(KafkavisitExample example);

    int deleteByExample(KafkavisitExample example);

    int insert(Kafkavisit record);

    int insertSelective(Kafkavisit record);

    List<Kafkavisit> selectByExampleWithBLOBs(KafkavisitExample example);

    List<Kafkavisit> selectByExample(KafkavisitExample example);

    int updateByExampleSelective(@Param("record") Kafkavisit record, @Param("example") KafkavisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Kafkavisit record, @Param("example") KafkavisitExample example);

    int updateByExample(@Param("record") Kafkavisit record, @Param("example") KafkavisitExample example);
}