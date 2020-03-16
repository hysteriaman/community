package com.liam.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author Liam_chen
 */
@Controller
public class HelloController {

    @GetMapping("/hello") //获取get请求
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);//name属性用于与页面交互，model内置的类用于把某个属性显示在页面上
        return "hello";
    }
}