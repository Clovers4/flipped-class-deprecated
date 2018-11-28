package online.templab.flippedclass.service.impl;

import online.templab.flippedclass.dao.AdminDao;
import online.templab.flippedclass.domain.Admin;
import online.templab.flippedclass.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 管理员 业务逻辑 实现类
 *
 * @author W.K
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public List<Admin> listAll() {
        return adminDao.listAll();
    }
}
