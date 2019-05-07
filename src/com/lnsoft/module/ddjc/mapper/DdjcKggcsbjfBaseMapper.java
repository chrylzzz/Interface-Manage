package com.lnsoft.module.ddjc.mapper;

import com.lnsoft.module.ddjc.pojo.DdjcKggcsbjfBase;
import com.lnsoft.module.ddjc.pojo.DdjcKggcsbjfBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdjcKggcsbjfBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int countByExample(DdjcKggcsbjfBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int deleteByExample(DdjcKggcsbjfBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int deleteByPrimaryKey(String ysjlId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int insert(DdjcKggcsbjfBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int insertSelective(DdjcKggcsbjfBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    List<DdjcKggcsbjfBase> selectByExample(DdjcKggcsbjfBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    DdjcKggcsbjfBase selectByPrimaryKey(String ysjlId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByExampleSelective(@Param("record") DdjcKggcsbjfBase record, @Param("example") DdjcKggcsbjfBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByExample(@Param("record") DdjcKggcsbjfBase record, @Param("example") DdjcKggcsbjfBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByPrimaryKeySelective(DdjcKggcsbjfBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByPrimaryKey(DdjcKggcsbjfBase record);
}