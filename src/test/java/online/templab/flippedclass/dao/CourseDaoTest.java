package online.templab.flippedclass.dao;

import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.Course;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

// @Transactional
public class CourseDaoTest extends FlippedClassApplicationTest {

    @Autowired
    CourseDao courseDao;

    private Course getRandomCourse() {
        Course course = new Course();
        course.setTeacherId(1);
        course.setName("测试课程_" + random.nextInt(10));
        course.setShareSeminarMasterCourseId(0);
        course.setShareTeamMasterCourseId(0);
        course.setPresentationWeight(BigDecimal.valueOf(0));
        course.setQuetionWeight(BigDecimal.valueOf(0));
        course.setReportWeight(BigDecimal.valueOf(0));
        return course;
    }

    @Test
    public void insert() {
        courseDao.insert(getRandomCourse());
        courseDao.insert(getRandomCourse());
        courseDao.insert(getRandomCourse());
    }
}
