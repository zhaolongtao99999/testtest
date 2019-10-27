package cn.itcast.controller;


import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserService service;

    @RequestMapping("/findById")
    public String findById(Model model){
        User user = service.findById(1);
        model.addAttribute("user",user);
        return "itemDetail";
    }
}
