package online.templab.flippedclass.dao;

import online.templab.flippedclass.domain.CourseSeminar;
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
 * CourseSeminarDao 单元测试类
 *
 * @author F.J
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CourseSeminarDaoTest {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    CourseSeminarDao courseSeminarDao;

    private CourseSeminar getRandomCourseSeminar() {
        CourseSeminar courseSeminar = new CourseSeminar();
        courseSeminar.setCourseId(12306);
        courseSeminar.setSeminarId(12580);
        return courseSeminar;
    }

    @Test
    public void init() {
        assert courseSeminarDao != null;
    }

    @Test
    public void insert() {
        CourseSeminar course = getRandomCourseSeminar();
        boolean insertSuccess = courseSeminarDao.insert(course) > 0;
        Assert.assertTrue(insertSuccess);
    }

    @Test
    public void deleteById() {
        CourseSeminar courseSeminar = getRandomCourseSeminar();
        courseSeminarDao.insert(courseSeminar);
        boolean deleteSuccess = courseSeminarDao.deleteById(courseSeminar.getId()) == 1;
        Assert.assertTrue(deleteSuccess);
    }

    @Test
    public void updateById() {
        CourseSeminar courseSeminar = getRandomCourseSeminar();
        courseSeminarDao.insert(courseSeminar);
        courseSeminar.setCourseId(119);
        courseSeminar.setSeminarId(120);

        logger.info(courseSeminar.toString());

        Assert.assertEquals(1, courseSeminarDao.updateById(courseSeminar));

        CourseSeminar recordFromDB = courseSeminarDao.getById(courseSeminar.getId());
        Assert.assertEquals(courseSeminar.getCourseId(), recordFromDB.getCourseId());
        Assert.assertEquals(courseSeminar.getSeminarId(), recordFromDB.getSeminarId());
    }
}
