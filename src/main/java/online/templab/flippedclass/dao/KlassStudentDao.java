package online.templab.flippedclass.dao;

import java.util.List;
import online.templab.flippedclass.domain.KlassStudent;
import online.templab.flippedclass.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author ： F.J
 */
@Mapper
@Component
public interface KlassStudentDao {
    /**
     * 通过id 删除
     */
    int deleteById(Integer id);

    /**
     */
    int insert(KlassStudent record);

    /**
     */
    KlassStudent selectByPrimaryKey(Integer id);

    /**
     */
    List<KlassStudent> selectAll();

    /**
     */
    int updateByPrimaryKey(KlassStudent record);

    List<Student> listByKlassId(Integer klassId);
}