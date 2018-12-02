package online.templab.flippedclass.service;

import online.templab.flippedclass.domain.Course;

import java.util.List;

/**
 * @author W.K
 */
public interface CourseService {

    List<Course> listCourseByTeacherId(Integer teacherId);

    List<Course> listCourseByStudentId(Integer studentId);
}
