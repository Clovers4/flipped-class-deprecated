package online.templab.flippedclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/teacher/course")
public class MobileTeacherCourseController {

    @RequestMapping(value="",method=GET)
    //得到当前老师用户的所有课程信息（id和名字）
    public String teacherCourse(Model model) {
        String[] courseName={"OOAD","J2EE"};
        String[] courseId={"1","2"};
        model.addAttribute("courseNames", courseName);
        model.addAttribute("courseIds", courseId);
        return "mobile/teacher/course/courseManage";
    }
}
