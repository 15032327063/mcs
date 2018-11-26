package com.scb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scb.dao.TeamMapper;
import com.scb.pojo.Team;
import com.scb.pojo.TeamExample;
import com.scb.service.ITeamService;
import com.scb.util.TokenIDFactory;
/**
 * 
 * ClassName: TeamServiceImpl <br/>
 * Description: team service层实现类. <br/><br/>
 * date: 2018年11月19日 下午12:00:21 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class TeamServiceImpl implements ITeamService {

	@Resource
	private TeamMapper teamDao;

	@Override
	public int saveTeamInfo(Team team) {
		team.setTeamId(TokenIDFactory.getUUID());
		
		return teamDao.insertSelective(team);
	}

	@Override
	public int editTeamInfo(Team team) {
		
		return teamDao.updateByPrimaryKeySelective(team);
	}

	@Override
	public List<Team> queryAllTeamInfo() {
		TeamExample example = new TeamExample();
		
		return teamDao.selectByExample(example);
	}

	@Override
	public Team queryTeamInfoById(String teamId) {
		
		return teamDao.selectByPrimaryKey(teamId);
	}

	@Override
	public List<Team> queryTeamInfoByName(String teamName) {
		TeamExample example = new TeamExample();
		example.createCriteria().andTeamNameEqualTo(teamName);
		
		return teamDao.selectByExample(example);
	}
	
}
