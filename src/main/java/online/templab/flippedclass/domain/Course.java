package online.templab.flippedclass.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 课程 实体类
 *
 * @author F.J
 */
public class Course implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 课程编号 course.id
     */
    private Integer id;

    /**
     * .老师编号 teacher_id
     */
    private Integer teacherId;

    /**
     * 课程名 course.name
     */
    private String name;

    /**
     * 课程介绍 course.intro
     */
    private String intro;

    /**
     * 共享分组的主课程编号 course.share_team_master_course_id
     */
    private Integer shareTeamMasterCourseId;

    /**
     * 共享讨论课的主课程编号 course.share_seminar_master_course_id
     */
    private Integer shareSeminarMasterCourseId;

    /**
     * 展示权重 course.presentation_weight
     */
    private BigDecimal presentationWeight;

    /**
     * 报告权重 course.report_weight
     */
    private BigDecimal reportWeight;

    /**
     * 提问权重 course.quetion_weight
     */
    private BigDecimal quetionWeight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public Integer getShareTeamMasterCourseId() {
        return shareTeamMasterCourseId;
    }

    public void setShareTeamMasterCourseId(Integer shareTeamMasterCourseId) {
        this.shareTeamMasterCourseId = shareTeamMasterCourseId;
    }

    public Integer getShareSeminarMasterCourseId() {
        return shareSeminarMasterCourseId;
    }

    public void setShareSeminarMasterCourseId(Integer shareSeminarMasterCourseId) {
        this.shareSeminarMasterCourseId = shareSeminarMasterCourseId;
    }

    public BigDecimal getPresentationWeight() {
        return presentationWeight;
    }

    public void setPresentationWeight(BigDecimal presentationWeight) {
        this.presentationWeight = presentationWeight;
    }

    public BigDecimal getReportWeight() {
        return reportWeight;
    }

    public void setReportWeight(BigDecimal reportWeight) {
        this.reportWeight = reportWeight;
    }

    public BigDecimal getQuetionWeight() {
        return quetionWeight;
    }

    public void setQuetionWeight(BigDecimal quetionWeight) {
        this.quetionWeight = quetionWeight;
    }

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