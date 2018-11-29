package online.templab.flippedclass.domain;

import java.io.Serializable;

/**
 * 学生-班级关系 实体类
 *
 * @author F.J
 */
public class StudentKlass implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 student_klass.id
     */
    private Integer id;

    /**
     * 学生编号 student_klass.user_id
     */
    private Integer userId;

    /**
     * 班级编号 student_klass.klass_id
     */
    private Integer klassId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getKlassId() {
        return klassId;
    }

    public void setKlassId(Integer klassId) {
        this.klassId = klassId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", klassId=").append(klassId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}