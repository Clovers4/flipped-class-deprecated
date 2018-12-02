package online.templab.flippedclass.service;

import online.templab.flippedclass.domain.Team;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 队伍 接口类
 *
 * @author : F.J
 */
@Service
public interface TeamService {

    /**
     * 插入一个队伍
     */
     int insert(Team record,Integer klassId);

    /**
     * 删除一个队伍
     */
    int deleteById(Integer id,Integer klassId);

    /**
     * 更新队伍信息
     */
    int updateById(Team team);

    /**
     * 获取一门课程下所有队伍
     */
    List<Team> listTeamByCourseId(Integer courseId);

    /**
     * 判定队伍是否合法
     */
    boolean validTeam(Integer id);
}
