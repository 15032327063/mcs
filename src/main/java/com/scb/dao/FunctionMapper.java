package com.scb.dao;

import com.scb.pojo.Function;
import com.scb.pojo.FunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunctionMapper {
    /**
     *
     * @mbg.generated 2018-11-25
     */
    long countByExample(FunctionExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByExample(FunctionExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByPrimaryKey(String functionId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insert(Function record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insertSelective(Function record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    List<Function> selectByExample(FunctionExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    Function selectByPrimaryKey(String functionId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") Function record, @Param("example") FunctionExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExample(@Param("record") Function record, @Param("example") FunctionExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKeySelective(Function record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKey(Function record);
}