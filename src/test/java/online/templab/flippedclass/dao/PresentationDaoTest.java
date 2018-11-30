package online.templab.flippedclass.dao;

import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.Presentation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;


/**
 * KlassTeamDao 单元测试类
 *
 * @author F.J
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PresentationDaoTest extends FlippedClassApplicationTest {

    @Autowired
    PresentationDao presentationDao;

    private Presentation getRandomPresentation() {
        Presentation presentation = new Presentation();
        presentation.setCourseId(random.nextInt(10));
        presentation.setSeminarId(random.nextInt(10));
        presentation.setTeamId(random.nextInt(10));
        presentation.setOrder(random.nextInt(10));
        presentation.setScore(BigDecimal.valueOf(4.5));
        return presentation;
    }

    @Test
    public void init() {
        assert presentationDao != null;
    }

    @Test
    public void insert() {
        Presentation presentation = getRandomPresentation();
        logger.info(presentation.toString());
        boolean insertSuccess = presentationDao.insert(presentation) > 0;
        Assert.assertTrue(insertSuccess);
    }

    @Test
    public void deleteById() {
        Presentation presentation = getRandomPresentation();
        presentationDao.insert(presentation);
        logger.info(presentation.toString());
        boolean deleteSuccess = presentationDao.deleteById(presentation.getId()) == 1;
        Assert.assertTrue(deleteSuccess);
    }

    @Test
    public void updateById() {
        Presentation presentation = getRandomPresentation();
        presentationDao.insert(presentation);
        presentation.setTeamId(99999);
        presentation.setSeminarId(12580);
        presentation.setOrder(6);
        presentation.setCourseId(6767);

        logger.info(presentation.toString());

        Assert.assertEquals(1, presentationDao.updateById(presentation));

        Presentation recordFromDB = presentationDao.getById(presentation.getId());
        logger.info(recordFromDB.toString());
        Assert.assertEquals(presentation.getCourseId(), recordFromDB.getCourseId());
        Assert.assertEquals(presentation.getSeminarId(), recordFromDB.getSeminarId());
        Assert.assertEquals(presentation.getTeamId(), recordFromDB.getTeamId());
        Assert.assertEquals(presentation.getOrder(), recordFromDB.getOrder());
    }
}
