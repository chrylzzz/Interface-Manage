package com.lnsoft.module.ld.mapper;

import com.lnsoft.module.ld.pojo.Ldvisit;
import com.lnsoft.module.ld.pojo.LdvisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdvisitMapper {
    int countByExample(LdvisitExample example);

    int deleteByExample(LdvisitExample example);

    int insert(Ldvisit record);

    int insertSelective(Ldvisit record);

    List<Ldvisit> selectByExampleWithBLOBs(LdvisitExample example);

    List<Ldvisit> selectByExample(LdvisitExample example);

    int updateByExampleSelective(@Param("record") Ldvisit record, @Param("example") LdvisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Ldvisit record, @Param("example") LdvisitExample example);

    int updateByExample(@Param("record") Ldvisit record, @Param("example") LdvisitExample example);
}