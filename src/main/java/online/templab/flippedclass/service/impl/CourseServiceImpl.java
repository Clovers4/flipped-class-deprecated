package online.templab.flippedclass.service.impl;

import online.templab.flippedclass.dao.CourseDao;
import online.templab.flippedclass.domain.Course;
import online.templab.flippedclass.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author W.K
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;

    @Override
    public List<Course> listCourseByTeacherId(Integer teacherId) {
        return courseDao.listByTeacherId(teacherId);
    }

    @Override
    public List<Course> listCourseByStudentId(Integer studentId) {
        return courseDao.listByStudentId(studentId);
    }


}
