package cn.ken.controller;

import cn.ken.entity.User;
import cn.ken.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    public String userList(Model model){
        List<User> userList = userService.selectAll();
        model.addAttribute("userList",userList);
        return "usertest";
    }
}
