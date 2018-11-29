package online.templab.flippedclass.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 提问 实体类
 *
 * @author F.J
 */
public class Question implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 column question.id
     */
    private Integer id;

    /**
     * 展示编号 question.presentation_id
     */
    private Integer presentationId;

    /**
     * 队伍编号 question.team_id
     */
    private Integer teamId;

    /**
     * 学生编号 question.student_id
     */
    private Integer studentId;

    /**
     * 分数 column question.score
     */
    private BigDecimal score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPresentationId() {
        return presentationId;
    }

    public void setPresentationId(Integer presentationId) {
        this.presentationId = presentationId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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
        sb.append(", presentationId=").append(presentationId);
        sb.append(", teamId=").append(teamId);
        sb.append(", studentId=").append(studentId);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}