package online.templab.flippedclass.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 讨论课 实体类
 *
 * @author F.J
 */
public class Seminar implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 seminar.id
     */
    private Integer id;

    /**
     * 讨论课话题 seminar.topic
     */
    private String topic;

    /**
     * 讨论课介绍 seminar.intro
     */
    private String intro;

    /**
     * 讨论课状态 seminar.state
     */
    private Integer state;

    /**
     * 讨论课报名开始时间 seminar.sign_up_start_time
     */
    private Date signUpStartTime;

    /**
     * 讨论课报名截止时间 seminar.sign_up_end_time
     */
    private Date signUpEndTime;

    /**
     * 讨论课展示顺序模式 seminar.presentation_order_mode
     */
    private Integer presentationOrderMode;

    /**
     * 每个讨论课限制队伍数量 seminar.team_num_limit
     */
    private Integer teamNumLimit;

    /**
     * 报告截止时间 seminar.report_end_time
     */
    private Date reportEndTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getSignUpStartTime() {
        return signUpStartTime;
    }

    public void setSignUpStartTime(Date signUpStartTime) {
        this.signUpStartTime = signUpStartTime;
    }

    public Date getSignUpEndTime() {
        return signUpEndTime;
    }

    public void setSignUpEndTime(Date signUpEndTime) {
        this.signUpEndTime = signUpEndTime;
    }

    public Integer getPresentationOrderMode() {
        return presentationOrderMode;
    }

    public void setPresentationOrderMode(Integer presentationOrderMode) {
        this.presentationOrderMode = presentationOrderMode;
    }

    public Integer getTeamNumLimit() {
        return teamNumLimit;
    }

    public void setTeamNumLimit(Integer teamNumLimit) {
        this.teamNumLimit = teamNumLimit;
    }

    public Date getReportEndTime() {
        return reportEndTime;
    }

    public void setReportEndTime(Date reportEndTime) {
        this.reportEndTime = reportEndTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", topic=").append(topic);
        sb.append(", intro=").append(intro);
        sb.append(", state=").append(state);
        sb.append(", signUpStartTime=").append(signUpStartTime);
        sb.append(", signUpEndTime=").append(signUpEndTime);
        sb.append(", presentationOrderMode=").append(presentationOrderMode);
        sb.append(", teamNumLimit=").append(teamNumLimit);
        sb.append(", reportEndTime=").append(reportEndTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}