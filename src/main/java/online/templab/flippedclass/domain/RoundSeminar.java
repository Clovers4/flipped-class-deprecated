package online.templab.flippedclass.domain;

import java.io.Serializable;

/**
 * 轮次-讨论课关系 实体类
 *
 * @author F.J
 */
public class RoundSeminar implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 round_seminar.id
     */
    private Integer id;

    /**
     * 轮次编号 round_seminar.round_id
     */
    private Integer roundId;

    /**
     * 讨论课编号 round_seminar.seminar_id
     */
    private Integer seminarId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoundId() {
        return roundId;
    }

    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
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
        sb.append(", roundId=").append(roundId);
        sb.append(", seminarId=").append(seminarId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}