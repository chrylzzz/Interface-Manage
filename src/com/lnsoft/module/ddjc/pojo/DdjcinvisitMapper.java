package com.lnsoft.module.ddjc.pojo;

import com.lnsoft.module.ddjc.pojo.Ddjcinvisit;
import com.lnsoft.module.ddjc.pojo.DdjcinvisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdjcinvisitMapper {
    int countByExample(DdjcinvisitExample example);

    int deleteByExample(DdjcinvisitExample example);

    int insert(Ddjcinvisit record);

    int insertSelective(Ddjcinvisit record);

    List<Ddjcinvisit> selectByExampleWithBLOBs(DdjcinvisitExample example);

    List<Ddjcinvisit> selectByExample(DdjcinvisitExample example);

    int updateByExampleSelective(@Param("record") Ddjcinvisit record, @Param("example") DdjcinvisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Ddjcinvisit record, @Param("example") DdjcinvisitExample example);

    int updateByExample(@Param("record") Ddjcinvisit record, @Param("example") DdjcinvisitExample example);
}