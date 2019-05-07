package com.lnsoft.module.qx.qxlys.mapper;

import com.lnsoft.module.qx.qxlys.pojo.Qxlysvisit;
import com.lnsoft.module.qx.qxlys.pojo.QxlysvisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QxlysvisitMapper {
    int countByExample(QxlysvisitExample example);

    int deleteByExample(QxlysvisitExample example);

    int insert(Qxlysvisit record);

    int insertSelective(Qxlysvisit record);

    List<Qxlysvisit> selectByExampleWithBLOBs(QxlysvisitExample example);

    List<Qxlysvisit> selectByExample(QxlysvisitExample example);

    int updateByExampleSelective(@Param("record") Qxlysvisit record, @Param("example") QxlysvisitExample example);

    int updateByExampleWithBLOBs(@Param("record") Qxlysvisit record, @Param("example") QxlysvisitExample example);

    int updateByExample(@Param("record") Qxlysvisit record, @Param("example") QxlysvisitExample example);
}