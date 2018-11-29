package online.templab.flippedclass.dao;


import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.Admin;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

/**
 * AdminDao 单元测试类
 *
 * @author W.K
 */
@Transactional
public class AdminDaoTest extends FlippedClassApplicationTest {

    @Autowired
    AdminDao adminDao;

    private Admin getRandomAdmin() {
        Admin admin = new Admin();
        admin.setAccount("admin_test_" + random.nextInt(10000));
        admin.setPassword("abc123");
        return admin;
    }

    @Test
    public void init() {
        assert adminDao != null;
    }

    @Test
    public void insert() {
        Admin admin = getRandomAdmin();
        logger.info(admin.toString());
        Assert.assertEquals(1, adminDao.insert(admin));
    }

    @Test
    public void deleteById() {
        Admin admin = getRandomAdmin();
        adminDao.insert(admin);
        logger.info(admin.toString());

        Assert.assertEquals(1, adminDao.deleteById(admin.getId()));
    }

    @Test
    public void updateById() {
        Admin admin = getRandomAdmin();
        adminDao.insert(admin);

        admin.setPassword("new123");
        logger.info(admin.toString());
        Assert.assertEquals(1, adminDao.updateById(admin));

        Admin recordFormDB = adminDao.getByAccount(admin.getAccount());
        logger.info(recordFormDB.toString());
        Assert.assertEquals(admin.getPassword(), recordFormDB.getPassword());
    }

    @Test
    public void getById() {
        Admin admin = getRandomAdmin();
        adminDao.insert(admin);

        Admin recordFormDB = adminDao.getById(admin.getId());
        logger.info(recordFormDB.toString());
        Assert.assertTrue(recordFormDB != null);
    }

    @Test
    public void getByAccount() {
        Admin admin = getRandomAdmin();
        adminDao.insert(admin);

        Admin recordFormDB = adminDao.getByAccount(admin.getAccount());
        logger.info(recordFormDB.toString());
        Assert.assertTrue(recordFormDB != null);
    }

    @Test
    public void listAll() {
        List<Admin> admins = adminDao.listAll();
        logger.info(admins.toString());
        Assert.assertTrue(admins != null);
    }
}
