package online.templab.flippedclass.dao;

import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.KlassTeam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 * KlassTeamDao 单元测试类
 *
 * @author F.J
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class KlassTeamDaoTest extends FlippedClassApplicationTest {

    @Autowired
    KlassTeamDao klassTeamDao;

    private KlassTeam getRandomKlassTeam() {
        KlassTeam klassTeam = new KlassTeam();
        klassTeam.setKlassId(12345);
        klassTeam.setTeamId(98765);
        return klassTeam;
    }

    @Test
    public void init() {
        assert klassTeamDao != null;
    }

    @Test
    public void insert() {
        KlassTeam klassTeam = getRandomKlassTeam();
        logger.info(klassTeam.toString());
        boolean insertSuccess = klassTeamDao.insert(klassTeam) > 0;
        Assert.assertTrue(insertSuccess);
    }

    @Test
    public void deleteById() {
        KlassTeam klassTeam = getRandomKlassTeam();
        klassTeamDao.insert(klassTeam);
        logger.info(klassTeam.toString());
        boolean deleteSuccess = klassTeamDao.deleteById(klassTeam.getId()) == 1;
        Assert.assertTrue(deleteSuccess);
    }

    @Test
    public void updateById() {
        KlassTeam klassTeam = getRandomKlassTeam();
        klassTeamDao.insert(klassTeam);
        klassTeam.setTeamId(99999);
        klassTeam.setKlassId(12580);

        logger.info(klassTeam.toString());

        Assert.assertEquals(1, klassTeamDao.updateById(klassTeam));

        KlassTeam recordFromDB = klassTeamDao.getById(klassTeam.getId());
        logger.info(recordFromDB.toString());
        Assert.assertEquals(klassTeam.getKlassId(), recordFromDB.getKlassId());
        Assert.assertEquals(klassTeam.getTeamId(), recordFromDB.getTeamId());
    }
}
