package online.templab.flippedclass.dao;

import java.util.List;
import online.templab.flippedclass.domain.KlassTeam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author ： F.J
 */
@Mapper
@Component
public interface KlassTeamDao {
    /**
     * 通过id 删除班级-队伍关系
     */
    int deleteById(Integer id);

    /**
     * 插入一个班级-队伍关系
     */
    int insert(KlassTeam record);

    /**
     * 通过id获取班级-队伍关系
     */
    KlassTeam getById(Integer id);

    /**
     * 获取所有班级-队伍关系表内容
     */
    List<KlassTeam> listAll();

    /**
     * 通过id 更新 班级-队伍关系
     */
    int updateById(KlassTeam record);
}