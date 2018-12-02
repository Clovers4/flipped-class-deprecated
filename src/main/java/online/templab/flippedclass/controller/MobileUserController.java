package online.templab.flippedclass.controller;

import online.templab.flippedclass.domain.Student;
import online.templab.flippedclass.domain.Teacher;
import online.templab.flippedclass.service.StudentService;
import online.templab.flippedclass.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("")
public class MobileUserController {

    @Autowired
    TeacherService teacherService;

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/login", method = GET)
    public String homePage() {
        return "mobile/user/login";
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = POST)
    //输入账号密码进行登陆验证
    public Map<String, Object> login(String account, String password, HttpSession session) {
        Map<String, Object> resultMap = new HashMap<String, Object>();

        Teacher teacher = teacherService.login(account, password);
        Student student = studentService.login(account, password);
        if (teacher != null) {
            //获得使用的身份
            resultMap.put("User", "teacher");
            resultMap.put("State", "true");
            session.setAttribute("teacher", teacher);
        } else if (student != null) {
            //获得使用的身份
            resultMap.put("User", "student");
            resultMap.put("State", "true");
            session.setAttribute("student", student);
        } else {
            resultMap.put("State", "false");
            //返回错误信息
            resultMap.put("Message", "密码错误");
        }
        return resultMap;
    }

    @RequestMapping(value = "/findPassword", method = GET)
    public String findPassword() {

        return "findPassword";
    }

    @ResponseBody
    @RequestMapping(value = "/findPassword", method = POST)
    //输入账号、密码、验证码进行密码修改操作
    public Map<String, Object> changePassword(String account, String password, String yanzheng) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        //验证账号正确性;
        resultMap.put("Result", "true");
        resultMap.put("Message", "验证码错误");//如果错误填写错误信息
        return resultMap;
    }
}
