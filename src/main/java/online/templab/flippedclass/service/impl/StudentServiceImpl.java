package online.templab.flippedclass.service.impl;

import online.templab.flippedclass.dao.StudentDao;
import online.templab.flippedclass.domain.Student;
import online.templab.flippedclass.domain.Teacher;
import online.templab.flippedclass.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author W.K
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public Student login(String account, String password) {
        Student student = studentDao.getByAccount(account);
        // 账号不存在
        if (student == null) {
            return null;
        }
        //密码错误
        if (!password.equals(student.getPassword())) {
            return null;
        }
        return student;
    }
}
