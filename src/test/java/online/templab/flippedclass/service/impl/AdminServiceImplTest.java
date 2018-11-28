package online.templab.flippedclass.service.impl;

import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.Admin;
import online.templab.flippedclass.service.AdminService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * AdminServiceImpl 单元测试类
 *
 * @author W.K
 */
@Transactional
public class AdminServiceImplTest extends FlippedClassApplicationTest {

    @Autowired
    AdminService adminService;

    @Test
    public void listAll() {
        // TODO: adminService貌似应该使用Mock的方式来使得service层和dao层的方法解耦，从而可以缩小单元测试粒度
        List<Admin> admins = adminService.listAll();
        logger.info(admins.toString());
        Assert.assertTrue(admins != null && admins.size() >= 0);
    }
}