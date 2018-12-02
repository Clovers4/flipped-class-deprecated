package online.templab.flippedclass.dao;

import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.Teacher;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
public class TeacherDaoTest extends FlippedClassApplicationTest {

    @Autowired
    TeacherDao teacherDao;

    private Teacher getTeacher() {
        Teacher teacher = new Teacher();
        teacher.setAccount("teacher_1");
        teacher.setPassword("123456");
        teacher.setActivative(false);
        teacher.setName("测试老师");
        return teacher;
    }

    @Test
    public void insert() {
        Teacher teacher = getTeacher();
        teacherDao.insert(teacher);
    }
}
