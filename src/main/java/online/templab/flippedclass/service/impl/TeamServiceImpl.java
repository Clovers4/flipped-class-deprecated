package online.templab.flippedclass.service.impl;

import online.templab.flippedclass.dao.*;
import online.templab.flippedclass.domain.*;
import online.templab.flippedclass.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : F.J
 */
@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamDao teamDao;

    @Autowired
    KlassTeamDao klassTeamDao;

    @Autowired
    TeamStudentDao teamStudentDao;

    @Autowired
    TeamRuleDao teamRuleDao;

    @Autowired
    KlassDao klassDao;

    @Autowired
    KlassStudentDao klassStudentDao;

    /**
     * 插入一个队伍
     *
     * @para : team 队伍
     * @para : klassId 班级id
     */
    @Override
    public int insert(Team team, Integer klassId) {
        KlassTeam klassTeam = new KlassTeam();
        klassTeam.setTeamId(team.getId());
        klassTeam.setKlassId(klassId);
        int insertKT = klassTeamDao.insert(klassTeam);
        int insertT = teamDao.insert(team);
        return insertKT & insertT;
    }

    /**
     * 通过id删除一个队伍
     */
    @Override
    public int deleteById(Integer id, Integer klassId) {
        int deleteT = teamDao.deleteById(id);
        int deleteKT = klassTeamDao.deleteById(klassId);
        return deleteKT & deleteT;
    }

    /**
     * 更新队伍信息
     */
    @Override
    public int updateById(Team team) {
        return teamDao.updateById(team);
    }

    /**
     * 通过课程id 去查找课程下所有组队
     */
    @Override
    public List<Team> listByCourseId(Integer courseId) {
        return teamDao.listByCourseId(courseId);
    }

    /**
     * 判定队伍是否合法
     *
     * @para : id 队伍id
     */
    @Override
    public boolean valid(Integer id) {
        Team record = teamDao.getById(id);
        return record.getValid();
    }

    /**
     * 强制拉人
     */
    @Override
    public boolean addStudent(Integer teamId, Integer studentId, Integer courseId) {
        TeamRule teamRule = teamRuleDao.getByCourseId(courseId);
        int stuNumber = teamStudentDao.countStudent(teamId);//获取该队伍先有学生数量
        stuNumber++;
        if (stuNumber <= teamRule.getMaxMemberNum() && stuNumber >= teamRule.getMinMemberNum()) {
            TeamStudent teamStudent = new TeamStudent();
            teamStudent.setStudentId(studentId);
            teamStudent.setTeamId(teamId);
            teamStudentDao.insert(teamStudent);
            return true;
        }
        return false;
    }

    /**
     * 强制踢人
     *
     * @param teamId
     * @param studentId
     * @param courseId
     * @return
     */
    @Override
    public boolean deleteStudent(Integer teamId, Integer studentId, Integer courseId) {
        TeamRule teamRule = teamRuleDao.getByCourseId(courseId);
        int stuNumber = teamStudentDao.countStudent(teamId);//获取该队伍先有学生数量
        stuNumber--;
        if (stuNumber <= teamRule.getMaxMemberNum() && stuNumber >= teamRule.getMinMemberNum()) {
            TeamStudent teamStudent = new TeamStudent();
            teamStudent.setTeamId(teamId);
            teamStudent.setStudentId(studentId);
            teamStudentDao.deleteByStudentId(teamStudent);
            return true;
        }
        return false;
    }

    /**
     * 获取所有未组队学生
     */
    @Override
    public List<Student> listUnTeamStudent(Integer courseId){
        // 获取课程下所有班级
        List<Klass> listKlass = klassDao.listKlassByCourseId(courseId);

        // 获取课程下所有学生
        List<Student> studentListAll = new ArrayList<>();
        // 所有组队学生id
        List<Integer> teamedStudent = new ArrayList<>();
        // 获取所有队伍
        List<KlassTeam> klassTeams = new ArrayList<>();

        for(Klass klass : listKlass){
            List<Student> listStudent = klassStudentDao.listByKlassId(klass.getId());
            studentListAll.addAll(listStudent);// 获取课程下所有学生

            List<KlassTeam> klassTeam = klassTeamDao.listAll();
            klassTeams.addAll(klassTeam);// 获取班级下所有队伍
        }

        for(KlassTeam temp:klassTeams){
            List<Integer> studentIdList = teamStudentDao.listByTeamId(temp.getTeamId());
            teamedStudent.addAll(studentIdList);
        }

        for(int i =0;i<studentListAll.size();i++){
            for(int j=0;j<teamedStudent.size();j++){
                if(studentListAll.get(i).getId().equals(teamedStudent.get(j))){
                    studentListAll.remove(i);
                    break;
                }
            }
        }
        
        return studentListAll;
    }

}
