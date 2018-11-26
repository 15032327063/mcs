package com.scb.pojo;

import java.util.Date;

public class Account {
    /**
     * 账户编号
     */
    private String accountId;

    /**
     * 账户密码
     */
    private String accountPassword;

    /**
     * 账户更新人
     */
    private String accountUpdatedUser;

    /**
     * 账户更新时间
     */
    private Date accountUpdatedTime;

    /**
     * 账户编号
     * @return account_id 账户编号
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 账户编号
     * @param accountId 账户编号
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * 账户密码
     * @return account_password 账户密码
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * 账户密码
     * @param accountPassword 账户密码
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword == null ? null : accountPassword.trim();
    }

    /**
     * 账户更新人
     * @return account_updated_user 账户更新人
     */
    public String getAccountUpdatedUser() {
        return accountUpdatedUser;
    }

    /**
     * 账户更新人
     * @param accountUpdatedUser 账户更新人
     */
    public void setAccountUpdatedUser(String accountUpdatedUser) {
        this.accountUpdatedUser = accountUpdatedUser == null ? null : accountUpdatedUser.trim();
    }

    /**
     * 账户更新时间
     * @return account_updated_time 账户更新时间
     */
    public Date getAccountUpdatedTime() {
        return accountUpdatedTime;
    }

    /**
     * 账户更新时间
     * @param accountUpdatedTime 账户更新时间
     */
    public void setAccountUpdatedTime(Date accountUpdatedTime) {
        this.accountUpdatedTime = accountUpdatedTime;
    }
}