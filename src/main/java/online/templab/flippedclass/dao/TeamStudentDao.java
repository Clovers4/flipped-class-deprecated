package online.templab.flippedclass.dao;

import java.util.List;
import online.templab.flippedclass.domain.TeamStudent;

public interface TeamStudentDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_student
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_student
     *
     * @mbg.generated
     */
    int insert(TeamStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_student
     *
     * @mbg.generated
     */
    TeamStudent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_student
     *
     * @mbg.generated
     */
    List<TeamStudent> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_student
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TeamStudent record);
}