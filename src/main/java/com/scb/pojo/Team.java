package com.scb.pojo;

import java.util.Date;

public class Team {
    /**
     * team编号
     */
    private String teamId;

    /**
     * team名称
     */
    private String teamName;

    /**
     * team更新时间
     */
    private Date teamUpdatedTime;

    /**
     * team创建人
     */
    private String teamCreatedUser;

    /**
     * team创建时间
     */
    private Date teamCreatedTime;

    /**
     * team更新人
     */
    private String teamUpdatedUser;

    /**
     * team编号
     * @return team_id team编号
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * team编号
     * @param teamId team编号
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    /**
     * team名称
     * @return team_name team名称
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * team名称
     * @param teamName team名称
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    /**
     * team更新时间
     * @return team_updated_time team更新时间
     */
    public Date getTeamUpdatedTime() {
        return teamUpdatedTime;
    }

    /**
     * team更新时间
     * @param teamUpdatedTime team更新时间
     */
    public void setTeamUpdatedTime(Date teamUpdatedTime) {
        this.teamUpdatedTime = teamUpdatedTime;
    }

    /**
     * team创建人
     * @return team_created_user team创建人
     */
    public String getTeamCreatedUser() {
        return teamCreatedUser;
    }

    /**
     * team创建人
     * @param teamCreatedUser team创建人
     */
    public void setTeamCreatedUser(String teamCreatedUser) {
        this.teamCreatedUser = teamCreatedUser == null ? null : teamCreatedUser.trim();
    }

    /**
     * team创建时间
     * @return team_created_time team创建时间
     */
    public Date getTeamCreatedTime() {
        return teamCreatedTime;
    }

    /**
     * team创建时间
     * @param teamCreatedTime team创建时间
     */
    public void setTeamCreatedTime(Date teamCreatedTime) {
        this.teamCreatedTime = teamCreatedTime;
    }

    /**
     * team更新人
     * @return team_updated_user team更新人
     */
    public String getTeamUpdatedUser() {
        return teamUpdatedUser;
    }

    /**
     * team更新人
     * @param teamUpdatedUser team更新人
     */
    public void setTeamUpdatedUser(String teamUpdatedUser) {
        this.teamUpdatedUser = teamUpdatedUser == null ? null : teamUpdatedUser.trim();
    }
}