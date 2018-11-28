package online.templab.flippedclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// TODO:测试用，可以删除

/**
 * 测试用Controller，可以删除
 *
 * @author W.K
 */
@Controller
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("")
    public String hello(Model model) throws Exception {
        System.out.println("这里是helloController");
        model.addAttribute("test", "这是一条由Model产生的消息");
        return "hello";
    }

    @RequestMapping("/error")
    public String testError(Model model) throws Exception {
        if (true) {
            throw new RuntimeException();
        }
        return "hello";
    }

}