package online.templab.flippedclass.service.impl;

import online.templab.flippedclass.dao.UserDao;
import online.templab.flippedclass.domain.User;
import online.templab.flippedclass.enums.UserRole;
import online.templab.flippedclass.exception.UserAlreadyExistException;
import online.templab.flippedclass.exception.UserNotExistException;
import online.templab.flippedclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户 业务逻辑 实现类
 *
 * @author W.K
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    @Transactional(rollbackFor = UserAlreadyExistException.class)
    public int insert(User user) throws UserAlreadyExistException {
        int insertLine = 0;
        try {
            insertLine = userDao.insert(user);
        } catch (DuplicateKeyException e) {
            throw new UserAlreadyExistException();
        }
        return insertLine;
    }

    @Override
    public User getUser(String account) throws UserNotExistException {
        User user = userDao.getByAccount(account);
        if (user == null) {
            throw new UserNotExistException();
        }
        return user;
    }

    @Override
    public String getPassword(String account) {
        User user = userDao.getByAccount(account);
        if (user == null || user.getPassword() == null) {
            return "";
        }
        return user.getPassword();
    }

    @Override
    public String getRole(String account) {
        User user = userDao.getByAccount(account);
        if (user == null || user.getRole() == null) {
            return "";
        }
        return UserRole.getName(user.getRole());
    }

}
