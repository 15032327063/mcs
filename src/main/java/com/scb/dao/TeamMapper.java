package com.scb.dao;

import com.scb.pojo.Team;
import com.scb.pojo.TeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamMapper {
    /**
     *
     * @mbg.generated 2018-11-25
     */
    long countByExample(TeamExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByExample(TeamExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByPrimaryKey(String teamId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insert(Team record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insertSelective(Team record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    List<Team> selectByExample(TeamExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    Team selectByPrimaryKey(String teamId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKeySelective(Team record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKey(Team record);
}