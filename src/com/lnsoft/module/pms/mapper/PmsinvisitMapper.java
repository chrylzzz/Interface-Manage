package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.Pmsinvisit;
import com.lnsoft.module.pms.pojo.PmsinvisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsinvisitMapper {
    int countByExample(PmsinvisitExample example);

    int deleteByExample(PmsinvisitExample example);

    int insert(Pmsinvisit record);

    int insertSelective(Pmsinvisit record);

    List<Pmsinvisit> selectByExampleWithBLOBs(PmsinvisitExample example);

    List<Pmsinvisit> selectByExample(PmsinvisitExample example);

    int updateByExampleSelective(@Param("record") Pmsinvisit record, @Param("example") PmsinvisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Pmsinvisit record, @Param("example") PmsinvisitExample example);

    int updateByExample(@Param("record") Pmsinvisit record, @Param("example") PmsinvisitExample example);
}