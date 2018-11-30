package online.templab.flippedclass.exception;

/**
 * 用户已经存在 异常类
 *
 * @author W.K
 */
public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException() {
    }

    public UserAlreadyExistException(String message) {
        super(message);
    }
}
