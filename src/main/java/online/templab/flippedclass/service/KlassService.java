package online.templab.flippedclass.service;

import online.templab.flippedclass.domain.Klass;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 班级 接口类
 *
 * @author : F.J
 */
@Service
public interface KlassService {

    /**
     * 插入班级
     *
     * @return ： 插入成功返回1 ，插入失败抛出异常
     * @para ： klass
     */
    int insert(Klass klass);

    /**
     * 通过班级id删除班级
     */
    int deleteById(Integer id);

    /**
     * 通过课程id获取课程下所有班级
     */
    List<Klass> listKlassByCoursseId(Integer courseId);
}
