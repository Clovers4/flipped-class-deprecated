package online.templab.flippedclass.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 共享请求 实体类
 *
 * @author F.J
 */
public class ShareApplication implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 share_application.id
     */
    private Integer id;

    /**
     * 主课程编号 share_application.master_course_id
     */
    private Integer masterCourseId;

    /**
     * 从课程编号 share_application.slave_course_id
     */
    private Integer slaveCourseId;

    /**
     * 功能 share_application.function
     */
    private Integer function;

    /**
     * 状态 share_application.state
     */
    private Integer state;

    /**
     * 创建时间 share_application.create_time
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMasterCourseId() {
        return masterCourseId;
    }

    public void setMasterCourseId(Integer masterCourseId) {
        this.masterCourseId = masterCourseId;
    }

    public Integer getSlaveCourseId() {
        return slaveCourseId;
    }

    public void setSlaveCourseId(Integer slaveCourseId) {
        this.slaveCourseId = slaveCourseId;
    }

    public Integer getFunction() {
        return function;
    }

    public void setFunction(Integer function) {
        this.function = function;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", masterCourseId=").append(masterCourseId);
        sb.append(", slaveCourseId=").append(slaveCourseId);
        sb.append(", function=").append(function);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}