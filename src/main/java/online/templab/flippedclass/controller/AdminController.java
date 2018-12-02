package online.templab.flippedclass.controller;


import online.templab.flippedclass.domain.Admin;
import online.templab.flippedclass.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//cr

/**
 * 管理员 页面跳转逻辑 Controller 类
 *
 * @author W.K
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * TODO: 生产环境不应该允许访问这个，考虑删除这个方法
     */
    @RequestMapping("list-all")
    public String listAll(Model model) {
        List<Admin> admins = adminService.listAll();
        model.addAttribute("admins", admins);
        return "admin/list-all";
    }
}
