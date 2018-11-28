package online.templab.flippedclass.dao;


import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.Admin;
import online.templab.flippedclass.service.impl.AdminServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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

    Random random = new Random();

    private Admin getRandomAdmin() {
        AdminServiceImpl adminService;
        Admin admin = new Admin();
        admin.setAccount("superman" + random.nextInt(10000));
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
    public void deleteByPrimaryKey() {
        Admin admin = getRandomAdmin();
        adminDao.insert(admin);
        logger.info(admin.toString());

        Assert.assertEquals(1, adminDao.deleteById(admin.getId()));
    }

    @Test
    public void updateByPrimaryKey() {
        Admin admin = getRandomAdmin();
        adminDao.insert(admin);

        admin.setPassword("new123");
        logger.info(admin.toString());

        Assert.assertEquals(1, adminDao.updateById(admin));

        Admin recordFormDB = adminDao.getByAccount(admin.getAccount());
        Assert.assertEquals(admin.getPassword(), recordFormDB.getPassword());
    }
}
