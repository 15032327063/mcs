package com.scb.dao;

import com.scb.pojo.Menu;
import com.scb.pojo.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    /**
     *
     * @mbg.generated 2018-11-25
     */
    long countByExample(MenuExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByExample(MenuExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByPrimaryKey(String menuId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insert(Menu record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insertSelective(Menu record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    List<Menu> selectByExample(MenuExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    Menu selectByPrimaryKey(String menuId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKey(Menu record);
}