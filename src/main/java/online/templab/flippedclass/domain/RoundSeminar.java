package online.templab.flippedclass.domain;

import java.io.Serializable;

public class RoundSeminar implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column round_seminar.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column round_seminar.round_id
     *
     * @mbg.generated
     */
    private Integer roundId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column round_seminar.seminar_id
     *
     * @mbg.generated
     */
    private Integer seminarId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table round_seminar
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column round_seminar.id
     *
     * @return the value of round_seminar.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column round_seminar.id
     *
     * @param id the value for round_seminar.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column round_seminar.round_id
     *
     * @return the value of round_seminar.round_id
     *
     * @mbg.generated
     */
    public Integer getRoundId() {
        return roundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column round_seminar.round_id
     *
     * @param roundId the value for round_seminar.round_id
     *
     * @mbg.generated
     */
    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column round_seminar.seminar_id
     *
     * @return the value of round_seminar.seminar_id
     *
     * @mbg.generated
     */
    public Integer getSeminarId() {
        return seminarId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column round_seminar.seminar_id
     *
     * @param seminarId the value for round_seminar.seminar_id
     *
     * @mbg.generated
     */
    public void setSeminarId(Integer seminarId) {
        this.seminarId = seminarId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table round_seminar
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roundId=").append(roundId);
        sb.append(", seminarId=").append(seminarId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}