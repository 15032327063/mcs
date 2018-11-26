package com.scb.dao;

import com.scb.pojo.Account;
import com.scb.pojo.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    /**
     *
     * @mbg.generated 2018-11-25
     */
    long countByExample(AccountExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByExample(AccountExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByPrimaryKey(String accountId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insert(Account record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insertSelective(Account record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    List<Account> selectByExample(AccountExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    Account selectByPrimaryKey(String accountId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKey(Account record);
}