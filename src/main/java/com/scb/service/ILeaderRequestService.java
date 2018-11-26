package com.scb.service;

import java.util.Date;
import java.util.List;

import com.scb.pojo.LeaderRequest;
/**
 * 
 * ClassName: ILeaderRequestService <br/>
 * Description: leader请求service层接口. <br/><br/>
 * date: 2018年11月18日 下午8:52:42 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface ILeaderRequestService {
	/**
	 * 
	 * saveLeaderRequestInfo:(添加一个leader请求). <br/>
	 * @param leaderRequest 
	 * @return 0:插入失败  1：插入成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int saveLeaderRequestInfo(LeaderRequest leaderRequest);
	
	/**
	 * 
	 * editLeaderRequestInfo:(编辑leader请求信息). <br/>
	 * @param leaderRequest 
	 * @return 0:修改失败  1：修改成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int editLeaderRequestInfo(LeaderRequest leaderRequest);
	
	/**
	 * 
	 * queryAllLeaderRequestInfo:(查询所有leader请求信息). <br/>
	 * @param 
	 * @return 所有leader请求对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<LeaderRequest> queryAllLeaderRequestInfo();
	
	/**
	 * 
	 * queryLeaderRequestInfoById:(根据id查询leader请求信息). <br/>
	 * @param leaderRequestId 
	 * @return leader请求对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public LeaderRequest queryLeaderRequestInfoById(String leaderRequestId);
	
	/**
	 * 
	 * queryLeaderRequestInfoByRequestDate:(根据日期查询leader请求信息). <br/>
	 * @param leaderRequestDate 
	 * @return leader请求对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<LeaderRequest> queryLeaderRequestInfoByRequestDate(Date leaderRequestDate);
	
	/**
	 * 
	 * queryLeaderRequestInfoByRequestStatus:(根据状态查询leader请求信息). <br/>
	 * @param leaderRequestStatus 
	 * @return leader请求对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<LeaderRequest> queryLeaderRequestInfoByRequestStatus(String leaderRequestStatus);
	
	/**
	 * 
	 * queryLeaderRequestInfoByRequestEmployeeId:(根据员工Id查询leader请求信息). <br/>
	 * @param leaderRequestEmployeeId 
	 * @return leader请求对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<LeaderRequest> queryLeaderRequestInfoByRequestEmployeeId(String leaderRequestEmployeeId);
	
}