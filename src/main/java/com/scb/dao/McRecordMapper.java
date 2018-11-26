package com.scb.dao;

import com.scb.pojo.McRecord;
import com.scb.pojo.McRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface McRecordMapper {
    /**
     *
     * @mbg.generated 2018-11-25
     */
    long countByExample(McRecordExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByExample(McRecordExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int deleteByPrimaryKey(String mcRecordId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insert(McRecord record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int insertSelective(McRecord record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    List<McRecord> selectByExample(McRecordExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    McRecord selectByPrimaryKey(String mcRecordId);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") McRecord record, @Param("example") McRecordExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByExample(@Param("record") McRecord record, @Param("example") McRecordExample example);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKeySelective(McRecord record);

    /**
     *
     * @mbg.generated 2018-11-25
     */
    int updateByPrimaryKey(McRecord record);
}