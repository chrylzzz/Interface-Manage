package com.lnsoft.module.sbdzxjc.mapper;

import com.lnsoft.module.sbdzxjc.pojo.Sbdzxjcinvisit;
import com.lnsoft.module.sbdzxjc.pojo.SbdzxjcinvisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbdzxjcinvisitMapper {
    int countByExample(SbdzxjcinvisitExample example);

    int deleteByExample(SbdzxjcinvisitExample example);

    int insert(Sbdzxjcinvisit record);

    int insertSelective(Sbdzxjcinvisit record);

    List<Sbdzxjcinvisit> selectByExampleWithBLOBs(SbdzxjcinvisitExample example);

    List<Sbdzxjcinvisit> selectByExample(SbdzxjcinvisitExample example);

    int updateByExampleSelective(@Param("record") Sbdzxjcinvisit record, @Param("example") SbdzxjcinvisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Sbdzxjcinvisit record, @Param("example") SbdzxjcinvisitExample example);

    int updateByExample(@Param("record") Sbdzxjcinvisit record, @Param("example") SbdzxjcinvisitExample example);
}