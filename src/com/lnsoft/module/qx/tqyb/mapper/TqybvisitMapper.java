package com.lnsoft.module.qx.tqyb.mapper;

import com.lnsoft.module.qx.tqyb.pojo.Tqybvisit;
import com.lnsoft.module.qx.tqyb.pojo.TqybvisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TqybvisitMapper {
    int countByExample(TqybvisitExample example);

    int deleteByExample(TqybvisitExample example);

    int insert(Tqybvisit record);

    int insertSelective(Tqybvisit record);

    List<Tqybvisit> selectByExampleWithBLOBs(TqybvisitExample example);

    List<Tqybvisit> selectByExample(TqybvisitExample example);

    int updateByExampleSelective(@Param("record") Tqybvisit record, @Param("example") TqybvisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Tqybvisit record, @Param("example") TqybvisitExample example);

    int updateByExample(@Param("record") Tqybvisit record, @Param("example") TqybvisitExample example);
}