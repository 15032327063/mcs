package com.scb.dao;

import com.scb.pojo.MemberRequest;
import com.scb.pojo.MemberRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberRequestMapper {
    /**
     *
     * @mbg.generated 2018-11-25
     */
    long countByExample(MemberRequestExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByExample(MemberRequestExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByPrimaryKey(String memberRequestId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insert(MemberRequest record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insertSelective(MemberRequest record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    List<MemberRequest> selectByExample(MemberRequestExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    MemberRequest selectByPrimaryKey(String memberRequestId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") MemberRequest record, @Param("example") MemberRequestExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExample(@Param("record") MemberRequest record, @Param("example") MemberRequestExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKeySelective(MemberRequest record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKey(MemberRequest record);
}