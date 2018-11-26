package com.scb.service;

import java.util.Date;
import java.util.List;

import com.scb.pojo.McRecord;
/**
 * 
 * ClassName: IMcRecordService <br/>
 * Description: 餐券记录接口类. <br/><br/>
 * date: 2018年11月18日 下午8:09:33 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface IMcRecordService {
	/**
	 * 
	 * saveMcRecordInfo:(添加一个餐票记录). <br/>
	 * @param mcRecord 
	 * @return 0:插入失败  1：插入成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int saveMcRecordInfo(McRecord mcRecord);
	
	/**
	 * 
	 * editMcRecordInfo:(编辑餐票记录信息). <br/>
	 * @param mcRecord 
	 * @return 0:修改失败  1：修改成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int editMcRecordInfo(McRecord mcRecord);
	
	/**
	 * 
	 * queryAllMcRecordInfo:(查询所有餐票记录信息). <br/>
	 * @param 
	 * @return 所有餐票记录对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<McRecord> queryAllMcRecordInfo();
	
	/**
	 * 
	 * queryMcRecordInfoByTeamId:(根据teamId查询餐票记录信息). <br/>
	 * @param teamId 
	 * @return 餐票记录对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<McRecord> queryMcRecordInfoByTeamId(String teamId);
	
	/**
	 * 
	 * queryMcRecordInfoById:(根据id查询餐票记录信息). <br/>
	 * @param mcRecordId 
	 * @return 餐票记录对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public McRecord queryMcRecordInfoById(String mcRecordId);
	
	/**
	 * 
	 * queryMcRecordInfoByMcRecordDate:(根据餐券记录日期查询餐票记录信息). <br/>
	 * @param mcRecordDate 
	 * @return 餐票记录对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<McRecord> queryMcRecordInfoByMcRecordDate(Date mcRecordDate);
}
