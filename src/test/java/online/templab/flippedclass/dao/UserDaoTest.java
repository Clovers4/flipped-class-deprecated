package online.templab.flippedclass.dao;

import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.User;
import online.templab.flippedclass.enums.UserRole;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.annotation.Repeat;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;


/**
 * UserDaoTest 单元测试类
 *
 * @author W.K
 */
//@Transactional
public class UserDaoTest extends FlippedClassApplicationTest {

    @Autowired
    UserDao userDao;

    private User getRandomUser() {
        User user = new User();
        user.setAccount("user_test_dao_" + random.nextInt(10000));
        user.setPassword("abc123");
        user.setName("name_" + random.nextInt(100));
        user.setRole(UserRole.STUDENT.code);
        user.setActivative(false);
        return user;
    }

    private User getStaticUser() {
        User user = new User();
        user.setAccount("user_test_dao_static");
        user.setPassword("abc123");
        user.setName("name_s");
        user.setRole(UserRole.STUDENT.code);
        user.setActivative(false);
        return user;
    }

    @Test
    public void init() {
        assert userDao != null;
    }

    @Test
    @Repeat(5)
    public void insert() {
        User user = getRandomUser();
        logger.info(user.toString());
        Assert.assertEquals(1, userDao.insert(user));
    }

    @Test(expected = DuplicateKeyException.class)
    public void insertSame() {
        userDao.insert(getStaticUser());
        userDao.insert(getStaticUser());
    }

    @Test
    public void deleteById() {
        User user = getRandomUser();
        userDao.insert(user);
        logger.info(user.toString());
        Assert.assertEquals(1, userDao.deleteById(user.getId()));
    }

    @Test
    @Repeat(5)
    public void updateById() {
        User origin = getRandomUser();
        userDao.insert(origin);

        User updatedUser = new User();
        updatedUser.setId(origin.getId());
        updatedUser.setPassword("newUpdatedPassword");
        updatedUser.setEmail("test@mail.com");
        updatedUser.setActivative(true);
        logger.info(updatedUser.toString());
        Assert.assertEquals(1, userDao.updateById(updatedUser));

        User recordFormDB = userDao.getById(updatedUser.getId());
        logger.info(recordFormDB.toString());
        Assert.assertEquals("newUpdatedPassword", recordFormDB.getPassword());
        Assert.assertEquals("test@mail.com", recordFormDB.getEmail());
        Assert.assertEquals(true, recordFormDB.getActivative());
    }

    @Test
    public void getById() {
        User user = getRandomUser();
        userDao.insert(user);

        User recordFormDB = userDao.getById(user.getId());
        logger.info(recordFormDB.toString());
        Assert.assertTrue(recordFormDB != null);
    }

    @Test
    public void getByIdNotExist() {
        User recordFormDB = userDao.getById(1231247);
        Assert.assertTrue(recordFormDB == null);
    }

    @Test
    public void getByAccount() {
        User user = getRandomUser();
        userDao.insert(user);

        User recordFormDB = userDao.getByAccount(user.getAccount());
        logger.info(recordFormDB.toString());
        Assert.assertTrue(recordFormDB != null);
    }

    @Test
    public void getByAccountNotExist() {
        User recordFormDB = userDao.getByAccount("asdd1331233");
        Assert.assertTrue(recordFormDB == null);
    }

    @Test
    public void listAll() {
        List<User> users = userDao.listAll();
        logger.info(users.toString());
        Assert.assertTrue(users != null);
    }

}
