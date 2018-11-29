package online.templab.flippedclass.domain;

import java.io.Serializable;

/**
 * 课程-讨论课关系 实体类
 *
 * @author F.J
 */
public class CourseSeminar implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 course_seminar.id
     */
    private Integer id;

    /**
     * 课程编号 course_seminar.course_id
     */
    private Integer courseId;

    /**
     * 讨论课编号 course_seminar.seminar_id
     */
    private Integer seminarId;

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