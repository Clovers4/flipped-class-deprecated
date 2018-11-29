package online.templab.flippedclass.enums;

/**
 * User的Role。
 * <br/>
 * 借此判断登录用户的身份。
 *
 * @author W.K
 */
public enum UserRole {

    TEACHER((byte) 1),
    STUDENT((byte) 2);

    public Byte code;

    UserRole(Byte code) {
        this.code = code;
    }
}
