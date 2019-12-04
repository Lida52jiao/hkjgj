package com.battcn.mapper;

import com.battcn.entity.AgentBasePrice;
import com.battcn.entity.AgentBasePriceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgentBasePriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_agentbaseprice
     *
     * @mbggenerated
     */
    int countByExample(AgentBasePriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_agentbaseprice
     *
     * @mbggenerated
     */
    int deleteByExample(AgentBasePriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_agentbaseprice
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_agentbaseprice
     *
     * @mbggenerated
     */
    int insert(AgentBasePrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_agentbaseprice
     *
     * @mbggenerated
     */
    int insertSelective(AgentBasePrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_agentbaseprice
     *
     * @mbggenerated
     */
    List<AgentBasePrice> selectByExample(AgentBasePriceExample example);
    
    

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_agentbaseprice
     *
     * @mbggenerated
     */
    AgentBasePrice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_agentbaseprice
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AgentBasePrice record, @Param("example") AgentBasePriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_agentbaseprice
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AgentBasePrice record, @Param("example") AgentBasePriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_agentbaseprice
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AgentBasePrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mp_agentbaseprice
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AgentBasePrice record);
    
    
}