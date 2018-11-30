package online.templab.flippedclass.dao;

import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.KlassStudent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * KlassStudentDao 单元测试类
 *
 * @author F.J
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class KlassStudentDaoTest extends FlippedClassApplicationTest {

    @Autowired
    KlassStudentDao klassStudentDao;

    private Random random = new Random();

    private KlassStudent getRandomKlassStudent() {
        KlassStudent klassStudent = new KlassStudent();
        klassStudent.setKlassId(random.nextInt(10000));
        klassStudent.setStudentId(random.nextInt(10000));
        return klassStudent;
    }

    @Test
    public void init() {
        assert klassStudentDao != null;
    }

    @Test
    public void insert() {
        KlassStudent klassStudent = getRandomKlassStudent();
        logger.info(klassStudent.toString());
        boolean insertSuccess = klassStudentDao.insert(klassStudent) > 0;
        Assert.assertTrue(insertSuccess);
    }

    @Test
    public void deleteById() {
        KlassStudent klassStudent = getRandomKlassStudent();
        klassStudentDao.insert(klassStudent);
        logger.info(klassStudent.toString());
        boolean deleteSuccess = klassStudentDao.deleteById(klassStudent.getId()) == 1;
        Assert.assertTrue(deleteSuccess);
    }

    @Test
    public void updateById() {
        KlassStudent klassStudent = getRandomKlassStudent();
        klassStudentDao.insert(klassStudent);

        klassStudent.setStudentId(999999);
        klassStudent.setKlassId(12306);
        logger.info(klassStudent.toString());
        Assert.assertEquals(1, klassStudentDao.updateById(klassStudent));

        KlassStudent recordFromDB = klassStudentDao.getById(klassStudent.getId());
        logger.info(recordFromDB.toString());
        Assert.assertEquals(recordFromDB.getStudentId(), klassStudent.getStudentId());
        Assert.assertEquals(recordFromDB.getKlassId(), klassStudent.getKlassId());
    }
}
