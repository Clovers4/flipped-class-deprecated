package online.templab.flippedclass.dao;

import java.util.List;

import online.templab.flippedclass.domain.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author W.K
 */
@Mapper
@Component
public interface CourseDao {

    int deleteById(Integer id);

    int insert(Course record);

    Course getById(Integer id);

    List<Course> listAll();

    List<Course> listByTeacherId(Integer teacherId);

    List<Course> listByStudentId(Integer studentId);

    int updateById(Course record);
}