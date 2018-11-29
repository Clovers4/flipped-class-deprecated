package online.templab.flippedclass.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 展示 实体类
 *
 * @author F.J
 */
public class Presentation implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 presentation.id
     */
    private Integer id;

    /**
     * 课程编号 presentation.course_id
     */
    private Integer courseId;

    /**
     * 讨论课编号 presentation.seminar_id
     */
    private Integer seminarId;

    /**
     * 队伍编号 presentation.team_id
     */
    private Integer teamId;

    /**
     * 展示顺序 presentation.order
     */
    private Integer order;

    /**
     * 展示分数 presentation.score
     */
    private BigDecimal score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getSeminarId() {
        return seminarId;
    }

    public void setSeminarId(Integer seminarId) {
        this.seminarId = seminarId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", seminarId=").append(seminarId);
        sb.append(", teamId=").append(teamId);
        sb.append(", order=").append(order);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}