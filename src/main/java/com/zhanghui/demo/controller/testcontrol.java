package com.zhanghui.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testcontrol {

    @GetMapping("/list")
    public String re404(){
        return "list";
    }
}
