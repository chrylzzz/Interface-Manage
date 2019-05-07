package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.Pmsvisit;
import com.lnsoft.module.pms.pojo.PmsvisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsvisitMapper {
    int countByExample(PmsvisitExample example);

    int deleteByExample(PmsvisitExample example);

    int insert(Pmsvisit record);

    int insertSelective(Pmsvisit record);

    List<Pmsvisit> selectByExampleWithBLOBs(PmsvisitExample example);

    List<Pmsvisit> selectByExample(PmsvisitExample example);

    int updateByExampleSelective(@Param("record") Pmsvisit record, @Param("example") PmsvisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Pmsvisit record, @Param("example") PmsvisitExample example);

    int updateByExample(@Param("record") Pmsvisit record, @Param("example") PmsvisitExample example);
}