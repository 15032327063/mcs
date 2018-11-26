package com.scb.dao;

import com.scb.pojo.Employee;
import com.scb.pojo.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    /**
     *
     * @mbg.generated 2018-11-25
     */
    long countByExample(EmployeeExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByExample(EmployeeExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByPrimaryKey(String employeeId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insert(Employee record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insertSelective(Employee record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    Employee selectByPrimaryKey(String employeeId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKey(Employee record);
}