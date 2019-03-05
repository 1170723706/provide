package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

    @RequestMapping("ToPage")
    public String ToPage(String name){
        return name;
    }
}
