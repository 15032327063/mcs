package com.scb.dao;

import com.scb.pojo.Role;
import com.scb.pojo.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    /**
     *
     * @mbg.generated 2018-11-25
     */
    long countByExample(RoleExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByExample(RoleExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByPrimaryKey(String roleId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insert(Role record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insertSelective(Role record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    List<Role> selectByExample(RoleExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    Role selectByPrimaryKey(String roleId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKey(Role record);
}