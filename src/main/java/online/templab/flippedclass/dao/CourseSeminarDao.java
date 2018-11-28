package online.templab.flippedclass.dao;

import java.util.List;
import online.templab.flippedclass.domain.CourseSeminar;

public interface CourseSeminarDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_seminar
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_seminar
     *
     * @mbg.generated
     */
    int insert(CourseSeminar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_seminar
     *
     * @mbg.generated
     */
    CourseSeminar selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_seminar
     *
     * @mbg.generated
     */
    List<CourseSeminar> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_seminar
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CourseSeminar record);
}