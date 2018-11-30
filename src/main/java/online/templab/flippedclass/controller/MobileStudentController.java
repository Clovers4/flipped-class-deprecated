package online.templab.flippedclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 学生 页面跳转逻辑 Controller 类
 *
 * @author W.K
 */
@Controller
@RequestMapping("/mobile/student")
public class MobileStudentController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "mobile/student/index";
    }

}
