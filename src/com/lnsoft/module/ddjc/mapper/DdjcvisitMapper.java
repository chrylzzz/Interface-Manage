package com.lnsoft.module.ddjc.mapper;

import com.lnsoft.module.ddjc.pojo.Ddjcvisit;
import com.lnsoft.module.ddjc.pojo.DdjcvisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdjcvisitMapper {
    int countByExample(DdjcvisitExample example);

    int deleteByExample(DdjcvisitExample example);

    int insert(Ddjcvisit record);

    int insertSelective(Ddjcvisit record);

    List<Ddjcvisit> selectByExampleWithBLOBs(DdjcvisitExample example);

    List<Ddjcvisit> selectByExample(DdjcvisitExample example);

    int updateByExampleSelective(@Param("record") Ddjcvisit record, @Param("example") DdjcvisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Ddjcvisit record, @Param("example") DdjcvisitExample example);

    int updateByExample(@Param("record") Ddjcvisit record, @Param("example") DdjcvisitExample example);
}