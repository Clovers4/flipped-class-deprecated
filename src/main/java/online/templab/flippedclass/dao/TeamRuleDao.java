package online.templab.flippedclass.dao;

import java.util.List;
import online.templab.flippedclass.domain.TeamRule;

public interface TeamRuleDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_rule
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_rule
     *
     * @mbg.generated
     */
    int insert(TeamRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_rule
     *
     * @mbg.generated
     */
    TeamRule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_rule
     *
     * @mbg.generated
     */
    List<TeamRule> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_rule
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TeamRule record);
}