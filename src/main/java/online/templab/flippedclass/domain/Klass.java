package online.templab.flippedclass.domain;

import java.io.Serializable;

/**
 * 班级 实体类
 *
 * @author F.J
 */
public class Klass implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 klass.id
     */
    private Integer id;

    /**
     * 课程编号 klass.course_id
     */
    private Integer courseId;

    /**
     * 班级名称 klass.name
     */
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}