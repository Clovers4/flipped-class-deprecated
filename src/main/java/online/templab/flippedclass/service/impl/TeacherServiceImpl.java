package online.templab.flippedclass.service.impl;

import online.templab.flippedclass.dao.TeacherDao;
import online.templab.flippedclass.domain.Teacher;
import online.templab.flippedclass.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author W.K
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherDao teacherDao;

    @Override
    public Teacher login(String account, String password) {
        Teacher teacher = teacherDao.getByAccount(account);
        // 账号不存在
        if (teacher == null) {
            return null;
        }
        //密码错误
        if (!password.equals(teacher.getPassword())) {
            return null;
        }
        return teacher;
    }
}
