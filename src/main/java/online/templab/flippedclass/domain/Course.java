package online.templab.flippedclass.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Course implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.teacher_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private Integer teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.name
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.intro
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private String intro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.share_team_master_course_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private Integer shareTeamMasterCourseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.share_seminar_master_course_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private Integer shareSeminarMasterCourseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.presentation_weight
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private BigDecimal presentationWeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.report_weight
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private BigDecimal reportWeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.quetion_weight
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private BigDecimal quetionWeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.id
     *
     * @return the value of course.id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.id
     *
     * @param id the value for course.id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.teacher_id
     *
     * @return the value of course.teacher_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.teacher_id
     *
     * @param teacherId the value for course.teacher_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.name
     *
     * @return the value of course.name
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.name
     *
     * @param name the value for course.name
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.intro
     *
     * @return the value of course.intro
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.intro
     *
     * @param intro the value for course.intro
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.share_team_master_course_id
     *
     * @return the value of course.share_team_master_course_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public Integer getShareTeamMasterCourseId() {
        return shareTeamMasterCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.share_team_master_course_id
     *
     * @param shareTeamMasterCourseId the value for course.share_team_master_course_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setShareTeamMasterCourseId(Integer shareTeamMasterCourseId) {
        this.shareTeamMasterCourseId = shareTeamMasterCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.share_seminar_master_course_id
     *
     * @return the value of course.share_seminar_master_course_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public Integer getShareSeminarMasterCourseId() {
        return shareSeminarMasterCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.share_seminar_master_course_id
     *
     * @param shareSeminarMasterCourseId the value for course.share_seminar_master_course_id
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setShareSeminarMasterCourseId(Integer shareSeminarMasterCourseId) {
        this.shareSeminarMasterCourseId = shareSeminarMasterCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.presentation_weight
     *
     * @return the value of course.presentation_weight
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public BigDecimal getPresentationWeight() {
        return presentationWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.presentation_weight
     *
     * @param presentationWeight the value for course.presentation_weight
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setPresentationWeight(BigDecimal presentationWeight) {
        this.presentationWeight = presentationWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.report_weight
     *
     * @return the value of course.report_weight
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public BigDecimal getReportWeight() {
        return reportWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.report_weight
     *
     * @param reportWeight the value for course.report_weight
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setReportWeight(BigDecimal reportWeight) {
        this.reportWeight = reportWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.quetion_weight
     *
     * @return the value of course.quetion_weight
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public BigDecimal getQuetionWeight() {
        return quetionWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.quetion_weight
     *
     * @param quetionWeight the value for course.quetion_weight
     *
     * @mbg.generated Sun Dec 02 14:03:43 CST 2018
     */
    public void setQuetionWeight(BigDecimal quetionWeight) {
        this.quetionWeight = quetionWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
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
        sb.append(", teacherId=").append(teacherId);
        sb.append(", name=").append(name);
        sb.append(", intro=").append(intro);
        sb.append(", shareTeamMasterCourseId=").append(shareTeamMasterCourseId);
        sb.append(", shareSeminarMasterCourseId=").append(shareSeminarMasterCourseId);
        sb.append(", presentationWeight=").append(presentationWeight);
        sb.append(", reportWeight=").append(reportWeight);
        sb.append(", quetionWeight=").append(quetionWeight);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}