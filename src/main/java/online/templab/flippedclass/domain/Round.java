package online.templab.flippedclass.domain;

import java.io.Serializable;

/**
 * 轮次 实体类
 *
 * @author F.J
 */
public class Round implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 round.id
     */
    private Integer id;

    /**
     * 课程编号 round.course_id
     */
    private Integer courseId;

    /**
     * 每个轮次最大报名队伍个数 round.max_sigh_up_num
     */
    private Integer maxSighUpNum;

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

    public Integer getMaxSighUpNum() {
        return maxSighUpNum;
    }

    public void setMaxSighUpNum(Integer maxSighUpNum) {
        this.maxSighUpNum = maxSighUpNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", maxSighUpNum=").append(maxSighUpNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}