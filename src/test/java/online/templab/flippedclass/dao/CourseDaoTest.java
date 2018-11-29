package online.templab.flippedclass.dao;

import online.templab.flippedclass.domain.Course;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * CourseDao 单元测试类
 *
 * @author F.J
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CourseDaoTest {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    CourseDao courseDao;

    private Course getRandomCourse() {
        Course course = new Course();
        course.setIntro("hello course");
        course.setName("OOAD");
        course.setPresentationWeight(BigDecimal.valueOf(0.3));
        course.setQuetionWeight(BigDecimal.valueOf(0.3));
        course.setReportWeight(BigDecimal.valueOf(0.4));
        course.setShareSeminarMasterCourseId(114);
        course.setShareTeamMasterCourseId(119);
        course.setTeacherId(12306);
        return course;
    }

    @Test
    public void init() {
        assert courseDao != null;
    }

    @Test
    public void insert() {
        Course course = getRandomCourse();
        boolean insertSuccess = courseDao.insert(course) > 0;
        Assert.assertTrue(insertSuccess);
    }

    @Test
    public void deleteById() {
        Course course = getRandomCourse();
        courseDao.insert(course);
        boolean deleteSuccess = courseDao.deleteById(course.getId()) == 1;
        Assert.assertTrue(deleteSuccess);
    }

    @Test
    public void updateById() {
        Course course = getRandomCourse();
        courseDao.insert(course);
        course.setName("J2EE");

        logger.info(course.toString());

        Assert.assertEquals(1, courseDao.updateById(course));

        Course recordFromDB = courseDao.getById(course.getId());
        Assert.assertEquals(course.getName(), recordFromDB.getName());
    }
}
