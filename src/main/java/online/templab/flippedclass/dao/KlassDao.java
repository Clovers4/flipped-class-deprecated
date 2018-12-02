package online.templab.flippedclass.dao;

import java.util.List;

import online.templab.flippedclass.domain.Klass;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author ： F.J
 */
@Mapper
@Component
public interface KlassDao {

    /**
     * 通过id删除班级
     */
    int deleteById(Integer id);

    /**
     * 插入班级
     */
    int insert(Klass record);

    /**
     * 通过id获取班级
     */
    Klass getById(Integer id);

    /**
     * 获取所有班级
     */
    List<Klass> listAll();

    /**
     * 通过id更新班级
     */
    int updateById(Klass record);

    /**
     * 通过课程id获取课程下所有班级
     */
    List<Klass> listKlassByCourseId(Integer courseId);
}