package online.templab.flippedclass.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

//import com.j2ee.demo.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class MobileTeacherController {





    @RequestMapping(value="/person",method=GET)
    public String teacherPerson(Model model) {

        model.addAttribute("teacherId","35012378422");
        return "mobile/teacher/person";
    }


}
