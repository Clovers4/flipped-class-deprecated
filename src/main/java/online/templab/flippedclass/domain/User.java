package online.templab.flippedclass.domain;

import java.io.Serializable;

/**
 * 用户 实体类
 *
 * @author F.J
 */
public class User implements Serializable {

    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号 user.id
     */
    private Integer id;

    /**
     * 账号 user.account
     */
    private String account;

    /**
     * 密码 user.password
     */
    private String password;

    /**
     * 角色 user.role
     */
    private Byte role;

    /**
     * 邮箱 user.email
     */
    private String email;

    /**
     * 是否激活 user.activative
     */
    private Boolean activative;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getActivative() {
        return activative;
    }

    public void setActivative(Boolean activative) {
        this.activative = activative;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", role=").append(role);
        sb.append(", email=").append(email);
        sb.append(", activative=").append(activative);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}