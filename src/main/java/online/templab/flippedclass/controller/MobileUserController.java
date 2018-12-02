package online.templab.flippedclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("")
public class MobileUserController {



    @RequestMapping(value="/logIn",method=GET)
    public String homePage() {

        return "mobile/user/登陆";
    }

    @ResponseBody
    @RequestMapping(value="/logIn",method=POST)
    //输入账号密码进行登陆验证
    public Map<String, Object> logIn(String account, String password) {
        Map<String, Object> resultMap =  new HashMap<String,Object>();
        if(account.equals("123")&& password.equals("123456")) {
            resultMap.put("User", "teacher");//获得使用的身份
            resultMap.put("State","true");
        }
        else {
            resultMap.put("State","false");
            resultMap.put("Message","密码错误");//返回错误信息
        }
        return resultMap;
    }

    @RequestMapping(value="/findPassword",method=GET)
    public String findPassword() {

        return "mobile/user/找回密码";
    }

    @ResponseBody
    @RequestMapping(value="/findPassword",method=POST)
    //输入账号、密码、验证码进行密码修改操作
    public Map<String, Object> changePassword(String account,String password,String yanzheng) {
        Map<String, Object> resultMap =  new HashMap<String,Object>();
        //验证账号正确性;
        resultMap.put("Result","true");
        resultMap.put("Message","验证码错误");//如果错误填写错误信息
        return resultMap;
    }
}
