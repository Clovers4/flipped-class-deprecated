package online.templab.flippedclass.dao;

import java.util.List;

import online.templab.flippedclass.domain.TeamRule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author ： F.J
 */
@Mapper
@Component

public interface TeamRuleDao {

    /**
     *
     */
    int deleteById(Integer id);

    /**
     * 插入一个组队规则
     */
    int insert(TeamRule record);

    /**
     * 通过id 获取一个组队规则
     */
    TeamRule getById(Integer id);

    /**
     * 获取所有组队规则
     */
    List<TeamRule> listAll();

    /**
     * 通过id 更新组队规则
     */
    int updateById(TeamRule record);

    /**
     * 通过courseId 获取组队规则
     */
    TeamRule getByCourseId(Integer courseId);
}