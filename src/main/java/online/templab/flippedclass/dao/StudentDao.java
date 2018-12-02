package online.templab.flippedclass.dao;

import java.util.List;

import online.templab.flippedclass.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author W.K
 */
@Mapper
@Component
public interface StudentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    Student getById(Integer id);

    Student getByAccount(String account);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);
}