package com.scb.service;

import java.util.List;

import com.scb.pojo.MemberRequest;
/**
 * 
 * ClassName: IMemberRequestService <br/>
 * Description: member请求service层接口. <br/><br/>
 * date: 2018年11月18日 下午8:54:34 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface IMemberRequestService {
	/**
	 * 
	 * saveMemberRequestInfo:(添加一个member请求). <br/>
	 * @param memberRequest 
	 * @return 0:插入失败  1：插入成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int saveMemberRequestInfo(MemberRequest memberRequest);
	
	/**
	 * 
	 * editMemberRequestInfo:(编辑member请求信息). <br/>
	 * @param memberRequest 
	 * @return 0:修改失败  1：修改成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int editMemberRequestInfo(MemberRequest memberRequest);
	
	/**
	 * 
	 * queryAllMemberRequestInfo:(查询所有member请求信息). <br/>
	 * @param 
	 * @return 所有member请求对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<MemberRequest> queryAllMemberRequestInfo();
	
	/**
	 * 
	 * queryMemberRequestInfoById:(根据id查询member请求信息). <br/>
	 * @param memberrRequestId 
	 * @return member请求对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public MemberRequest queryMemberRequestInfoById(String memberRequestId);
	
	/**
	 * 
	 * queryMemberRequestInfoByRequestStatus:(根据状态查询member请求信息). <br/>
	 * @param memberRequestStatus 
	 * @return member请求对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<MemberRequest> queryMemberRequestInfoByRequestStatus(String memberRequestStatus);
	
	/**
	 * 
	 * queryMemberRequestInfoByRequestEmployeeId:(根据员工Id查询member请求信息). <br/>
	 * @param memberRequestEmployeeId 
	 * @return member请求对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<MemberRequest> queryMemberRequestInfoByRequestEmployeeId(String memberRequestEmployeeId);
}
