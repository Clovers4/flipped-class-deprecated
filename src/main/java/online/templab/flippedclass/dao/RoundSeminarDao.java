package online.templab.flippedclass.dao;

import java.util.List;
import online.templab.flippedclass.domain.RoundSeminar;

public interface RoundSeminarDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table round_seminar
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table round_seminar
     *
     * @mbg.generated
     */
    int insert(RoundSeminar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table round_seminar
     *
     * @mbg.generated
     */
    RoundSeminar selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table round_seminar
     *
     * @mbg.generated
     */
    List<RoundSeminar> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table round_seminar
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RoundSeminar record);
}