package online.templab.flippedclass.enums;

/**
 * User的Role。
 * <br/>
 * 借此判断登录用户的身份。
 *
 * @author W.K
 */
public enum UserRole {

    TEACHER(1),
    STUDENT(2);

    public Integer code;

    UserRole(Integer code) {
        this.code = code;
    }

    public static String getName(Integer code) {
        for (UserRole role : UserRole.values()) {
            if (code.equals(role.code)) {
                return role.toString().toLowerCase();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(UserRole.getName(1));
        System.out.println(UserRole.getName(2));
    }
}
