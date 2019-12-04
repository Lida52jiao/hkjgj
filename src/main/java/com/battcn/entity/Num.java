package com.battcn.entity;

public class Num {
    private Long id;

    private String level;

    private Long num;

    private String amount;

    private String paytype;

    private String mertype;

    private Long validtime;

    private String levellogo;

    private String levelbcard;

    private String funcexplain;

    private String agentstatus;

    private String showornot;

    private Long visitor;

    private Long vip;

    private Long highvip;

    private Long channel;

    private Long agent;

    private Long area;

    private Long institution;

    private String appid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getMertype() {
        return mertype;
    }

    public void setMertype(String mertype) {
        this.mertype = mertype == null ? null : mertype.trim();
    }

    public Long getValidtime() {
        return validtime;
    }

    public void setValidtime(Long validtime) {
        this.validtime = validtime;
    }

    public String getLevellogo() {
        return levellogo;
    }

    public void setLevellogo(String levellogo) {
        this.levellogo = levellogo == null ? null : levellogo.trim();
    }

    public String getLevelbcard() {
        return levelbcard;
    }

    public void setLevelbcard(String levelbcard) {
        this.levelbcard = levelbcard == null ? null : levelbcard.trim();
    }

    public String getFuncexplain() {
        return funcexplain;
    }

    public void setFuncexplain(String funcexplain) {
        this.funcexplain = funcexplain == null ? null : funcexplain.trim();
    }

    public String getAgentstatus() {
        return agentstatus;
    }

    public void setAgentstatus(String agentstatus) {
        this.agentstatus = agentstatus == null ? null : agentstatus.trim();
    }

    public String getShowornot() {
        return showornot;
    }

    public void setShowornot(String showornot) {
        this.showornot = showornot == null ? null : showornot.trim();
    }

    public Long getVisitor() {
        return visitor;
    }

    public void setVisitor(Long visitor) {
        this.visitor = visitor;
    }

    public Long getVip() {
        return vip;
    }

    public void setVip(Long vip) {
        this.vip = vip;
    }

    public Long getHighvip() {
        return highvip;
    }

    public void setHighvip(Long highvip) {
        this.highvip = highvip;
    }

    public Long getChannel() {
        return channel;
    }

    public void setChannel(Long channel) {
        this.channel = channel;
    }

    public Long getAgent() {
        return agent;
    }

    public void setAgent(Long agent) {
        this.agent = agent;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public Long getInstitution() {
        return institution;
    }

    public void setInstitution(Long institution) {
        this.institution = institution;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }
}