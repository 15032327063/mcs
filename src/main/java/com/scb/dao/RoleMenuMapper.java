package com.scb.dao;

import com.scb.pojo.RoleMenu;
import com.scb.pojo.RoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuMapper {
    /**
     *
     * @mbg.generated 2018-11-25
     */
    long countByExample(RoleMenuExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByExample(RoleMenuExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByPrimaryKey(String roleMenuId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insert(RoleMenu record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insertSelective(RoleMenu record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    List<RoleMenu> selectByExample(RoleMenuExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    RoleMenu selectByPrimaryKey(String roleMenuId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKeySelective(RoleMenu record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKey(RoleMenu record);
}