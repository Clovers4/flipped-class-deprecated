package online.templab.flippedclass.service.impl;

import online.templab.flippedclass.dao.KlassDao;
import online.templab.flippedclass.domain.Klass;
import online.templab.flippedclass.service.KlassService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : F.J
 */
public class KlassServiceImpl implements KlassService {

    @Autowired
    KlassDao klassDao;

    /**
     * 插入班级
     */
    @Override
    public int insert(Klass klass) {
        return klassDao.insert(klass);
    }

    /**
     * 通过班级id删除班级
     */
    @Override
    public int deleteById(Integer id) {
        return klassDao.deleteById(id);
    }

    /**
     * 通过课程id获取所有课程下班级
     */
    @Override
    public List<Klass> listKlassByCoursseId(Integer courseId) {
        return klassDao.listKlassByCourseId(courseId);
    }

}
