package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TSbZwycZsfhkg;
import com.lnsoft.module.pms.pojo.TSbZwycZsfhkgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSbZwycZsfhkgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSFHKG
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int countByExample(TSbZwycZsfhkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSFHKG
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByExample(TSbZwycZsfhkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSFHKG
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSFHKG
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insert(TSbZwycZsfhkg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSFHKG
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insertSelective(TSbZwycZsfhkg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSFHKG
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    List<TSbZwycZsfhkg> selectByExample(TSbZwycZsfhkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSFHKG
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    TSbZwycZsfhkg selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSFHKG
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSbZwycZsfhkg record, @Param("example") TSbZwycZsfhkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSFHKG
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExample(@Param("record") TSbZwycZsfhkg record, @Param("example") TSbZwycZsfhkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSFHKG
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(TSbZwycZsfhkg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSFHKG
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKey(TSbZwycZsfhkg record);
}