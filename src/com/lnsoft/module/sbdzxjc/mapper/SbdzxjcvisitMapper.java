package com.lnsoft.module.sbdzxjc.mapper;

import com.lnsoft.module.sbdzxjc.pojo.Sbdzxjcvisit;
import com.lnsoft.module.sbdzxjc.pojo.SbdzxjcvisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbdzxjcvisitMapper {
    int countByExample(SbdzxjcvisitExample example);

    int deleteByExample(SbdzxjcvisitExample example);

    int insert(Sbdzxjcvisit record);

    int insertSelective(Sbdzxjcvisit record);

    List<Sbdzxjcvisit> selectByExampleWithBLOBs(SbdzxjcvisitExample example);

    List<Sbdzxjcvisit> selectByExample(SbdzxjcvisitExample example);

    int updateByExampleSelective(@Param("record") Sbdzxjcvisit record, @Param("example") SbdzxjcvisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Sbdzxjcvisit record, @Param("example") SbdzxjcvisitExample example);

    int updateByExample(@Param("record") Sbdzxjcvisit record, @Param("example") SbdzxjcvisitExample example);
}