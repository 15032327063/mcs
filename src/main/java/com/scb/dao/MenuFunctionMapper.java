package com.scb.dao;

import com.scb.pojo.MenuFunction;
import com.scb.pojo.MenuFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuFunctionMapper {
    /**
     *
     * @mbg.generated 2018-11-25
     */
    long countByExample(MenuFunctionExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByExample(MenuFunctionExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByPrimaryKey(String menuFunctionId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insert(MenuFunction record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insertSelective(MenuFunction record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    List<MenuFunction> selectByExample(MenuFunctionExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    MenuFunction selectByPrimaryKey(String menuFunctionId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") MenuFunction record, @Param("example") MenuFunctionExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExample(@Param("record") MenuFunction record, @Param("example") MenuFunctionExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKeySelective(MenuFunction record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKey(MenuFunction record);
}