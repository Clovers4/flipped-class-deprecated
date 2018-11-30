package online.templab.flippedclass.service.impl;

import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.User;
import online.templab.flippedclass.enums.UserRole;
import online.templab.flippedclass.exception.UserAlreadyExistException;
import online.templab.flippedclass.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * AdminServiceImpl 单元测试类
 *
 * @author W.K
 */
@Transactional
public class UserServiceImplTest extends FlippedClassApplicationTest {

    @Autowired
    UserService userService;

    private User getRandomUser() {
        User user = new User();
        user.setAccount("user_test_service_" + random.nextInt(10000));
        user.setPassword("abc123");
        user.setName("user_");
        user.setRole(UserRole.STUDENT.code);
        user.setActivative(false);
        return user;
    }

    private User getStaticUser() {
        User user = new User();
        user.setAccount("user_test_service_static");
        user.setPassword("abc123");
        user.setName("user_");
        user.setRole(UserRole.STUDENT.code);
        user.setActivative(false);
        return user;
    }

    @Test
    public void init() {
        assert userService != null;
    }

    @Test
    public void insert() {
        User user = getRandomUser();
        Assert.assertEquals(1, userService.insert(user));
    }

    @Test(expected = UserAlreadyExistException.class)
    public void insertSame() {
        userService.insert(getStaticUser());
        userService.insert(getStaticUser());
    }


}
