package online.templab.flippedclass.service;


import online.templab.flippedclass.domain.User;
import online.templab.flippedclass.exception.UserNotExistException;

/**
 * 用户 业务逻辑 接口类
 *
 * @author W.K
 */
public interface UserService {

    /**
     * 新增（注册）一个用户。
     *
     * @param user
     * @return 成功则返回1；失败则抛出异常
     */
    int insert(User user);

    /**
     * 查找该账号对应的用户。成功则返回其实体类，不成功则抛出异常。
     *
     * @param account 账号
     * @return 若存在这个账号，返回其对应的用户实体类；不存在，则抛出异常。
     * @throws UserNotExistException
     */
    User getUser(String account) throws UserNotExistException;

    /**
     * 查找该账号对应的密码。成功则返回密码，不成功则返回空字符串，即""，不是null。
     *
     * @param account
     * @return 成功则返回密码，不成功则返回空字符串，即""，不是null。
     */
    String getPassword(String account);

    /**
     * 查找该账号对应的身份Role。成功则返回身份，不成功则返回空字符串，即""，不是null。
     *
     * @param account
     * @return 成功则返回身份，不成功则返回空字符串，即""，不是null。
     */
    String getRole(String account);
}
