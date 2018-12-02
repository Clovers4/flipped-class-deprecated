package online.templab.flippedclass.domain;

import java.io.Serializable;

public class CourseSeminar implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_seminar.id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_seminar.course_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_seminar.seminar_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private Integer seminarId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course_seminar
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_seminar.id
     *
     * @return the value of course_seminar.id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_seminar.id
     *
     * @param id the value for course_seminar.id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_seminar.course_id
     *
     * @return the value of course_seminar.course_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_seminar.course_id
     *
     * @param courseId the value for course_seminar.course_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_seminar.seminar_id
     *
     * @return the value of course_seminar.seminar_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public Integer getSeminarId() {
        return seminarId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_seminar.seminar_id
     *
     * @param seminarId the value for course_seminar.seminar_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setSeminarId(Integer seminarId) {
        this.seminarId = seminarId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_seminar
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", seminarId=").append(seminarId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}