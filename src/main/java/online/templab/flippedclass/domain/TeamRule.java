package online.templab.flippedclass.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 组队规则 实体类
 *
 * @author F.J
 */
public class TeamRule implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 team_rule.id
     */
    private Integer id;

    /**
     * 课程编号 team_rule.course_id
     */
    private Integer courseId;

    /**
     * 分组策略 team_rule.strategy
     */
    private Byte strategy;

    /**
     * 最大人数 team_rule.max_member_num
     */
    private Integer maxMemberNum;

    /**
     * 最小人数 team_rule.min_member_num
     */
    private Integer minMemberNum;

    /**
     * 截止日期 team_rule.end_time
     */
    private Date endTime;

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

    public Byte getStrategy() {
        return strategy;
    }

    public void setStrategy(Byte strategy) {
        this.strategy = strategy;
    }

    public Integer getMaxMemberNum() {
        return maxMemberNum;
    }

    public void setMaxMemberNum(Integer maxMemberNum) {
        this.maxMemberNum = maxMemberNum;
    }

    public Integer getMinMemberNum() {
        return minMemberNum;
    }

    public void setMinMemberNum(Integer minMemberNum) {
        this.minMemberNum = minMemberNum;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", strategy=").append(strategy);
        sb.append(", maxMemberNum=").append(maxMemberNum);
        sb.append(", minMemberNum=").append(minMemberNum);
        sb.append(", endTime=").append(endTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}