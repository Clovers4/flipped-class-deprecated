package online.templab.flippedclass.dao;

import java.util.List;

import online.templab.flippedclass.domain.Team;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author ： F.J
 */
@Mapper
@Component

public interface TeamDao {
    /**
     * 通过队伍id 删除队伍
     */
    int deleteById(Integer id);

    /**
     * 插入一个队伍
     */
    int insert(Team record);

    /**
     * 通过id火球一个队伍
     */
    Team getById(Integer id);

    /**
     * 获取所有队伍
     */
    List<Team> listAll();

    /**
     * 更新一个队伍
     */
    int updateById(Team record);

    /**
     * 查找一门课程下所有队伍
     */
    List<Team> listByCourseId(Integer id);
}