package com.battcn.entity;

import java.math.BigDecimal;

public class ChannelRate {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mp_channelrate.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mp_channelrate.rate
     *
     * @mbggenerated
     */
    private BigDecimal rate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mp_channelrate.d0Fee
     *
     * @mbggenerated
     */
    private Long d0fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mp_channelrate.aisleCode
     *
     * @mbggenerated
     */
    private String aislecode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mp_channelrate.appId
     *
     * @mbggenerated
     */
    private String appid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mp_channelrate.id
     *
     * @return the value of t_mp_channelrate.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mp_channelrate.id
     *
     * @param id the value for t_mp_channelrate.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mp_channelrate.rate
     *
     * @return the value of t_mp_channelrate.rate
     *
     * @mbggenerated
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mp_channelrate.rate
     *
     * @param rate the value for t_mp_channelrate.rate
     *
     * @mbggenerated
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mp_channelrate.d0Fee
     *
     * @return the value of t_mp_channelrate.d0Fee
     *
     * @mbggenerated
     */
    public Long getD0fee() {
        return d0fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mp_channelrate.d0Fee
     *
     * @param d0fee the value for t_mp_channelrate.d0Fee
     *
     * @mbggenerated
     */
    public void setD0fee(Long d0fee) {
        this.d0fee = d0fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mp_channelrate.aisleCode
     *
     * @return the value of t_mp_channelrate.aisleCode
     *
     * @mbggenerated
     */
    public String getAislecode() {
        return aislecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mp_channelrate.aisleCode
     *
     * @param aislecode the value for t_mp_channelrate.aisleCode
     *
     * @mbggenerated
     */
    public void setAislecode(String aislecode) {
        this.aislecode = aislecode == null ? null : aislecode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mp_channelrate.appId
     *
     * @return the value of t_mp_channelrate.appId
     *
     * @mbggenerated
     */
    public String getAppid() {
        return appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mp_channelrate.appId
     *
     * @param appid the value for t_mp_channelrate.appId
     *
     * @mbggenerated
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }
}