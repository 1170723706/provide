package com.jk.controller;

import com.jk.bean.Exprent;
import com.jk.bean.WenZhang;
import com.jk.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping("ToPage")
    public String ToPage(String name){
        return name;
    }

    @ResponseBody
    @RequestMapping("getzhuanjia")
    public List<Exprent> getzhuanjia(){
        List<Exprent> list = homeService.getzhuanjia();
        return list;
    }
    @ResponseBody
    @RequestMapping("getzanmei")
    public List<Exprent> getzanmei(){
        return homeService.getzanmei();
    }

    @ResponseBody
    @RequestMapping("getTitle")
    public List<WenZhang> getTitle(){
        return homeService.getTitle();
    }
}
