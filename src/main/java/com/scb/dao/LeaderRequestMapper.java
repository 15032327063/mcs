package com.scb.dao;

import com.scb.pojo.LeaderRequest;
import com.scb.pojo.LeaderRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaderRequestMapper {
    /**
     *
     * @mbg.generated 2018-11-25
     */
    long countByExample(LeaderRequestExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByExample(LeaderRequestExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByPrimaryKey(String leaderRequestId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insert(LeaderRequest record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insertSelective(LeaderRequest record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    List<LeaderRequest> selectByExample(LeaderRequestExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    LeaderRequest selectByPrimaryKey(String leaderRequestId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") LeaderRequest record, @Param("example") LeaderRequestExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExample(@Param("record") LeaderRequest record, @Param("example") LeaderRequestExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKeySelective(LeaderRequest record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKey(LeaderRequest record);
}