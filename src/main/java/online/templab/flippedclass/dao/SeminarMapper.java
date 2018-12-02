package online.templab.flippedclass.dao;

import java.util.List;
import online.templab.flippedclass.domain.Seminar;

public interface SeminarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seminar
     *
     * @mbg.generated Sun Dec 02 14:03:44 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seminar
     *
     * @mbg.generated Sun Dec 02 14:03:44 CST 2018
     */
    int insert(Seminar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seminar
     *
     * @mbg.generated Sun Dec 02 14:03:44 CST 2018
     */
    Seminar selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seminar
     *
     * @mbg.generated Sun Dec 02 14:03:44 CST 2018
     */
    List<Seminar> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seminar
     *
     * @mbg.generated Sun Dec 02 14:03:44 CST 2018
     */
    int updateByPrimaryKey(Seminar record);
}