package online.templab.flippedclass.controller;

import online.templab.flippedclass.domain.Course;
import online.templab.flippedclass.domain.Teacher;
import online.templab.flippedclass.service.CourseService;
import online.templab.flippedclass.service.StudentService;
import online.templab.flippedclass.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/teacher/course")
public class MobileTeacherCourseController {

    @Autowired
    TeacherService teacherService;

    @Autowired
    CourseService courseService;

    /**
     * 得到当前老师用户的所有课程信息（id和名字）
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "", method = GET)
    public String teacherCourse(Model model, HttpSession session) {
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        List<Course> courses = courseService.listCourseByTeacherId(teacher.getId());
        model.addAttribute("courses", courses);
        return "mobile/teacher/course/courseManage";
    }
}
