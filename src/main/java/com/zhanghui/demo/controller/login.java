package com.zhanghui.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class login {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String getlogin(@RequestParam("username") String username, @RequestParam("password")String password, Model model) {
        if (StringUtils.hasLength(username) && "123".equals(password)) {
            return "redirect:/main.html";
        } else {
            model.addAttribute("message","用户名或密码错误!");
            return "index";
        }
    }
}
