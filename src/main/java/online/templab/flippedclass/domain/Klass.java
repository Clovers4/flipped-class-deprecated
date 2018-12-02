package online.templab.flippedclass.domain;

import java.io.Serializable;

public class Klass implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column klass.id
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column klass.course_id
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column klass.time
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    private String time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column klass.location
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table klass
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column klass.id
     *
     * @return the value of klass.id
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column klass.id
     *
     * @param id the value for klass.id
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column klass.course_id
     *
     * @return the value of klass.course_id
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column klass.course_id
     *
     * @param courseId the value for klass.course_id
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column klass.time
     *
     * @return the value of klass.time
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column klass.time
     *
     * @param time the value for klass.time
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column klass.location
     *
     * @return the value of klass.location
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column klass.location
     *
     * @param location the value for klass.location
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table klass
     *
     * @mbg.generated Sun Dec 02 14:54:03 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", time=").append(time);
        sb.append(", location=").append(location);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}