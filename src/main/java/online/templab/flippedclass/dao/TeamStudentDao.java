package online.templab.flippedclass.dao;

import java.util.List;

import online.templab.flippedclass.domain.TeamStudent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author ： F.J
 */
@Mapper
@Component
public interface TeamStudentDao {
    /**
     * 通过id删除 队伍-学生关系
     */
    int deleteByid(Integer id);

    /**
     * 插入队伍-学生关系
     */
    int insert(TeamStudent record);

    /**
     * 通过id 获取队伍-学生关系
     */
    TeamStudent getById(Integer id);

    /**
     * 获取所有队伍-学生关系
     */
    List<TeamStudent> listAll();

    /**
     * 通过id 更新队伍-学生关系
     */
    int updateById(TeamStudent record);

    /**
     * 计算每个队伍有多少人
     */
    int countStudent(Integer teamId);

    /**
     * 通过学生id 删除该队伍中的一个学生
     */
    int deleteByStudentId(TeamStudent teamStudent);
}