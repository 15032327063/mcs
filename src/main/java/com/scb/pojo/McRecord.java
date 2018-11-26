package com.scb.pojo;

import java.util.Date;

public class McRecord {
    /**
     * 餐券记录编号
     */
    private String mcRecordId;

    /**
     * 餐券记录所属月份
     */
    private Date mcRecordDate;

    /**
     * 餐券总数
     */
    private Integer mcRecordSumnum;

    /**
     * 餐券剩余数
     */
    private Integer mcRecordRemain;

    /**
     * 餐券记录所属team编号
     */
    private String teamId;

    /**
     * 餐券记录编号
     * @return mc_record_id 餐券记录编号
     */
    public String getMcRecordId() {
        return mcRecordId;
    }

    /**
     * 餐券记录编号
     * @param mcRecordId 餐券记录编号
     */
    public void setMcRecordId(String mcRecordId) {
        this.mcRecordId = mcRecordId == null ? null : mcRecordId.trim();
    }

    /**
     * 餐券记录所属月份
     * @return mc_record_date 餐券记录所属月份
     */
    public Date getMcRecordDate() {
        return mcRecordDate;
    }

    /**
     * 餐券记录所属月份
     * @param mcRecordDate 餐券记录所属月份
     */
    public void setMcRecordDate(Date mcRecordDate) {
        this.mcRecordDate = mcRecordDate;
    }

    /**
     * 餐券总数
     * @return mc_record_sumnum 餐券总数
     */
    public Integer getMcRecordSumnum() {
        return mcRecordSumnum;
    }

    /**
     * 餐券总数
     * @param mcRecordSumnum 餐券总数
     */
    public void setMcRecordSumnum(Integer mcRecordSumnum) {
        this.mcRecordSumnum = mcRecordSumnum;
    }

    /**
     * 餐券剩余数
     * @return mc_record_remain 餐券剩余数
     */
    public Integer getMcRecordRemain() {
        return mcRecordRemain;
    }

    /**
     * 餐券剩余数
     * @param mcRecordRemain 餐券剩余数
     */
    public void setMcRecordRemain(Integer mcRecordRemain) {
        this.mcRecordRemain = mcRecordRemain;
    }

    /**
     * 餐券记录所属team编号
     * @return team_id 餐券记录所属team编号
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * 餐券记录所属team编号
     * @param teamId 餐券记录所属team编号
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }
}