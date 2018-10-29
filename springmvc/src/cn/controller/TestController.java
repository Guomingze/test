package cn.controller;

import cn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @RequestMapping("/hehe")
    public String hehe(String name){
        System.out.println(name);
        return "index";
    }
    @RequestMapping("/haha")
    public ModelAndView hehehe(User user){
        System.out.println(user.getName() + user.getAge());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username",user.getName());
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
