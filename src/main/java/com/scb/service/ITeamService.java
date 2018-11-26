package com.scb.service;

import java.util.List;

import com.scb.pojo.Team;
/**
 * 
 * ClassName: ITeamService <br/>
 * Description: team service层接口. <br/><br/>
 * date: 2018年11月19日 上午11:49:53 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface ITeamService {
	/**
	 * 
	 * saveTeamInfo:(添加一个team). <br/>
	 * @param team 
	 * @return 0:插入失败  1：插入成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int saveTeamInfo(Team team);
	
	/**
	 * 
	 * editTeamInfo:(编辑team信息). <br/>
	 * @param team 
	 * @return 0:修改失败  1：修改成功
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public int editTeamInfo(Team team);
	
	/**
	 * 
	 * queryAllTeamInfo:(查询所有team信息). <br/>
	 * @param 
	 * @return 所有team对象集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<Team> queryAllTeamInfo();
	
	/**
	 * 
	 * queryTeamInfoById:(根据id查询team信息). <br/>
	 * @param teamId 
	 * @return team对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public Team queryTeamInfoById(String teamId);
	
	/**
	 * 
	 * queryTeamnfoByName:(根据名字查询team信息). <br/>
	 * @param teamName 
	 * @return team对象
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public List<Team> queryTeamInfoByName(String teamName);
}
