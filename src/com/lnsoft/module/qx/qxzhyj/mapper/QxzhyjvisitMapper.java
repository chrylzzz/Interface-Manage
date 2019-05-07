package com.lnsoft.module.qx.qxzhyj.mapper;

import com.lnsoft.module.qx.qxzhyj.pojo.Qxzhyjvisit;
import com.lnsoft.module.qx.qxzhyj.pojo.QxzhyjvisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QxzhyjvisitMapper {
    int countByExample(QxzhyjvisitExample example);

    int deleteByExample(QxzhyjvisitExample example);

    int insert(Qxzhyjvisit record);

    int insertSelective(Qxzhyjvisit record);

    List<Qxzhyjvisit> selectByExampleWithBLOBs(QxzhyjvisitExample example);

    List<Qxzhyjvisit> selectByExample(QxzhyjvisitExample example);

    int updateByExampleSelective(@Param("record") Qxzhyjvisit record, @Param("example") QxzhyjvisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Qxzhyjvisit record, @Param("example") QxzhyjvisitExample example);

    int updateByExample(@Param("record") Qxzhyjvisit record, @Param("example") QxzhyjvisitExample example);
}