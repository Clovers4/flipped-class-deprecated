package online.templab.flippedclass.exception;

/**
 * 用户不存在 异常类
 *
 * @author IcaRuS
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
    }

    public UserNotExistException(String message) {
        super(message);
    }
}
