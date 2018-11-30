package online.templab.flippedclass.dao;

import online.templab.flippedclass.FlippedClassApplicationTest;
import online.templab.flippedclass.domain.Question;
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
public class QuestionDaoTest extends FlippedClassApplicationTest {

    @Autowired
    QuestionDao questionDao;

    private Question getRandomQuestion() {
        Question question = new Question();
        question.setPresentationId(random.nextInt(10));
        question.setScore(BigDecimal.valueOf(5.0));
        question.setStudentId(random.nextInt(10));
        question.setTeamId(random.nextInt(10));
        return question;
    }

    @Test
    public void init() {
        assert questionDao != null;
    }

    @Test
    public void insert() {
        Question question = getRandomQuestion();
        logger.info(question.toString());
        boolean insertSuccess = questionDao.insert(question) > 0;
        Assert.assertTrue(insertSuccess);
    }

    @Test
    public void deleteById() {
        Question question = getRandomQuestion();
        questionDao.insert(question);
        logger.info(question.toString());
        boolean deleteSuccess = questionDao.deleteById(question.getId()) == 1;
        Assert.assertTrue(deleteSuccess);
    }

    @Test
    public void updateById() {
        Question question = getRandomQuestion();
        questionDao.insert(question);
        question.setTeamId(99999);
        question.setStudentId(1234);
        question.setPresentationId(3232);

        logger.info(question.toString());

        Assert.assertEquals(1, questionDao.updateById(question));

        Question recordFromDB = questionDao.getById(question.getId());
        logger.info(recordFromDB.toString());
        Assert.assertEquals(question.getPresentationId(), recordFromDB.getPresentationId());
        Assert.assertEquals(question.getTeamId(), recordFromDB.getTeamId());
        Assert.assertEquals(question.getStudentId(), recordFromDB.getStudentId());
    }
}
