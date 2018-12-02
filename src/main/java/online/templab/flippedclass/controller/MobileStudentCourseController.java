package online.templab.flippedclass.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

//import com.j2ee.demo.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student/course")
public class MobileStudentCourseController {

    @RequestMapping(value="",method=GET)
    public String teacherPerson(Model model) {
        String[] courseName={"OOAD","J2EE"};
        String[] courseId={"1","2"};
        model.addAttribute("courseNames", courseName);
        model.addAttribute("courseIds", courseId);
        return "mobile/student/course/courseManage";
    }

}
