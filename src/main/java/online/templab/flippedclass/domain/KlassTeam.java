package online.templab.flippedclass.domain;

import java.io.Serializable;

/**
 * 班级-队伍关系 实体类
 *
 * @author F.J
 */
public class KlassTeam implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 klass_team.id
     */
    private Integer id;

    /**
     * 班级编号 klass_team.klass_id
     */
    private Integer klassId;

    /**
     * 队伍编号 klass_team.team_id
     */
    private Integer teamId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKlassId() {
        return klassId;
    }

    public void setKlassId(Integer klassId) {
        this.klassId = klassId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", klassId=").append(klassId);
        sb.append(", teamId=").append(teamId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}