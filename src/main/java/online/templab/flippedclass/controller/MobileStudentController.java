package online.templab.flippedclass.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import online.templab.flippedclass.domain.Course;
//import com.j2ee.demo.service.CourseService;
import online.templab.flippedclass.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class MobileStudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/person", method = GET)
    public String studentPerson(Model model) {
        return "mobile/student/person";
    }

}
