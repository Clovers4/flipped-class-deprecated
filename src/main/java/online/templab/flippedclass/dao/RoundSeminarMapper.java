package online.templab.flippedclass.dao;

import java.util.List;
import online.templab.flippedclass.domain.RoundSeminar;

public interface RoundSeminarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table round_seminar
     *
     * @mbg.generated Sun Dec 02 14:03:44 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table round_seminar
     *
     * @mbg.generated Sun Dec 02 14:03:44 CST 2018
     */
    int insert(RoundSeminar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table round_seminar
     *
     * @mbg.generated Sun Dec 02 14:03:44 CST 2018
     */
    RoundSeminar selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table round_seminar
     *
     * @mbg.generated Sun Dec 02 14:03:44 CST 2018
     */
    List<RoundSeminar> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table round_seminar
     *
     * @mbg.generated Sun Dec 02 14:03:44 CST 2018
     */
    int updateByPrimaryKey(RoundSeminar record);
}