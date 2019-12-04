package com.battcn.mapper;

import com.battcn.entity.MerchantsRemark;
import com.battcn.entity.MerchantsRemarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantsRemarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_merchants_remark
     *
     * @mbggenerated
     */
    int countByExample(MerchantsRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_merchants_remark
     *
     * @mbggenerated
     */
    int deleteByExample(MerchantsRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_merchants_remark
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_merchants_remark
     *
     * @mbggenerated
     */
    int insert(MerchantsRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_merchants_remark
     *
     * @mbggenerated
     */
    int insertSelective(MerchantsRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_merchants_remark
     *
     * @mbggenerated
     */
    List<MerchantsRemark> selectByExample(MerchantsRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_merchants_remark
     *
     * @mbggenerated
     */
    MerchantsRemark selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_merchants_remark
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MerchantsRemark record, @Param("example") MerchantsRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_merchants_remark
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MerchantsRemark record, @Param("example") MerchantsRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_merchants_remark
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MerchantsRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_merchants_remark
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MerchantsRemark record);
}