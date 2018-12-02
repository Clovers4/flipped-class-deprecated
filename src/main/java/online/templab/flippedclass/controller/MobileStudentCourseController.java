package online.templab.flippedclass.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

//import com.j2ee.demo.service.CourseService;
import online.templab.flippedclass.domain.Course;
import online.templab.flippedclass.domain.Student;
import online.templab.flippedclass.domain.Teacher;
import online.templab.flippedclass.service.CourseService;
import online.templab.flippedclass.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/student/course")
public class MobileStudentCourseController {

    @Autowired
    StudentService studentService;

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "", method = GET)
    public String person(Model model, HttpSession session) {
        Student student = (Student) session.getAttribute("student");
        List<Course> courses = courseService.listCourseByTeacherId(student.getId());
        model.addAttribute("courses", courses);
        return "mobile/student/course/courseManage";
    }

}
