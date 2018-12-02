package online.templab.flippedclass.service.impl;

import online.templab.flippedclass.dao.KlassTeamDao;
import online.templab.flippedclass.dao.TeamDao;
import online.templab.flippedclass.domain.KlassTeam;
import online.templab.flippedclass.domain.Team;
import online.templab.flippedclass.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : F.J
 */
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamDao teamDao;

    @Autowired
    KlassTeamDao klassTeamDao;

    /**
     * 插入一个队伍
     *
     * @para : team 队伍
     * @para : klassId 班级id
     */
    @Override
    public int insert(Team team,Integer klassId){
        KlassTeam klassTeam = new KlassTeam();
        klassTeam.setTeamId(team.getId());
        klassTeam.setKlassId(klassId);
        int insertKT = klassTeamDao.insert(klassTeam);
        int insertT = teamDao.insert(team);
        return insertKT&insertT;
    }

    /**
     * 通过id删除一个队伍
     */
    @Override
    public int deleteById(Integer id,Integer klassId){
        int deleteT = teamDao.deleteById(id);
        int deleteKT = klassTeamDao.deleteById(klassId);
        return deleteKT&deleteT;
    }

    /**
     * 更新队伍信息
     */
    @Override
    public int updateById(Team team){
        return teamDao.updateById(team);
    }

    /**
     * 通过课程id 去查找课程下所有组队
     */
    @Override
    public List<Team> listTeamByCourseId(Integer courseId){
        return teamDao.listTeamByCourseId(courseId);
    }

    /**
     * 判定队伍是否合法
     * @para : id 队伍id
     */
    @Override
    public boolean validTeam(Integer id){
        Team record = teamDao.getById(id);
        return record.getValid();
    }


}
