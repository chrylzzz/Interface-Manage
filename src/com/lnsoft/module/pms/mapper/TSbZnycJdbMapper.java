package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TSbZnycJdb;
import com.lnsoft.module.pms.pojo.TSbZnycJdbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSbZnycJdbMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JDB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int countByExample(TSbZnycJdbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JDB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByExample(TSbZnycJdbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JDB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JDB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insert(TSbZnycJdb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JDB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insertSelective(TSbZnycJdb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JDB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    List<TSbZnycJdb> selectByExample(TSbZnycJdbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JDB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    TSbZnycJdb selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JDB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSbZnycJdb record, @Param("example") TSbZnycJdbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JDB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExample(@Param("record") TSbZnycJdb record, @Param("example") TSbZnycJdbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JDB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(TSbZnycJdb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JDB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKey(TSbZnycJdb record);
}