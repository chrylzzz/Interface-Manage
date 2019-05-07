package com.lnsoft.module.gzlb.mapper;

import com.lnsoft.module.gzlb.pojo.Gzlbvisit;
import com.lnsoft.module.gzlb.pojo.GzlbvisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GzlbvisitMapper {
    int countByExample(GzlbvisitExample example);

    int deleteByExample(GzlbvisitExample example);

    int insert(Gzlbvisit record);

    int insertSelective(Gzlbvisit record);

    List<Gzlbvisit> selectByExampleWithBLOBs(GzlbvisitExample example);

    List<Gzlbvisit> selectByExample(GzlbvisitExample example);

    int updateByExampleSelective(@Param("record") Gzlbvisit record, @Param("example") GzlbvisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Gzlbvisit record, @Param("example") GzlbvisitExample example);

    int updateByExample(@Param("record") Gzlbvisit record, @Param("example") GzlbvisitExample example);
}