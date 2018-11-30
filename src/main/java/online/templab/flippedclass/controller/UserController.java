package online.templab.flippedclass.controller;

import online.templab.flippedclass.domain.User;
import online.templab.flippedclass.exception.UserNotExistException;
import online.templab.flippedclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * 登录 页面跳转逻辑 Controller 类
 *
 * @author W.K
 */
@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/mobile/login", method = RequestMethod.GET)
    public String login(Model model) {
        return "mobile/login";
    }

    @RequestMapping(value = "/mobile/login", method = RequestMethod.POST)
    public String login(Model model, HttpSession session,
                        @RequestParam("account") String account, @RequestParam("password") String password) {
        User record = null;
        try {
            record = userService.getUser(account);
        } catch (UserNotExistException e) {
            model.addAttribute("error", "账号不存在");
            return "mobile/login";
        }
        if (!record.getPassword().equals(password)) {
            model.addAttribute("error", "密码错误");
            return "mobile/login";
        }
        System.out.println(record);
        session.setAttribute("user",record);
        return "mobile/student/index";
    }


}
