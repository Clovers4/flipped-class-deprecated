package online.templab.flippedclass.dao;

import online.templab.flippedclass.domain.Klass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * KlassDao 单元测试类
 *
 * @author F.J
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class KlassDaoTest {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    KlassDao klassDao;

    Random random = new Random();

    private Klass getRandomKlass() {
        Klass klass = new Klass();
        klass.setName("2016级" + random.nextInt(10000));
        klass.setCourseId(random.nextInt(10000));
        return klass;
    }

    @Test
    public void init() {
        assert klassDao != null;
    }

    @Test
    public void insert() {
        Klass klass = getRandomKlass();
        boolean insertSuccess = klassDao.insert(klass) > 0;
        Assert.assertTrue(insertSuccess);
    }

    @Test
    public void deleteById() {
        Klass klass = getRandomKlass();
        klassDao.insert(klass);
        boolean deleteSuccess = klassDao.deleteById(klass.getId()) == 1;
        Assert.assertTrue(deleteSuccess);
    }

    @Test
    public void updateById() {
        Klass klass = getRandomKlass();
        klassDao.insert(klass);
        klass.setName("OOAD一班");
        klass.setCourseId(12580);

        logger.info(klass.toString());

        Assert.assertEquals(1, klassDao.updateById(klass));

        Klass recordFromDB = klassDao.getById(klass.getId());
        Assert.assertEquals(klass.getName(), recordFromDB.getName());
        Assert.assertEquals(klass.getCourseId(), recordFromDB.getCourseId());
    }
}
