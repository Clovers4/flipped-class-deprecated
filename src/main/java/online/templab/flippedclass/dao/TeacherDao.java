package online.templab.flippedclass.dao;

import java.util.List;

import online.templab.flippedclass.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author W.K
 */
@Mapper
@Component
public interface TeacherDao {

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    Teacher getById(Integer id);

    Teacher getByAccount(String account);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher record);


}