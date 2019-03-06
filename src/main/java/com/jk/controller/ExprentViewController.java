package com.jk.controller;


import com.jk.bean.Guandian;
import com.jk.service.ExprentViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ExprentViewController {


    @Autowired
    ExprentViewService exprentViewService;




    @RequestMapping("ToPage")
    public String ToPage(String name){
        return name;
    }







    /*
    *           转接灼见 标题展示
    *
    * */
    @RequestMapping("querExprent")
    @ResponseBody
    public List<Guandian> querExprent(Guandian guandian){


        List<Guandian> list = exprentViewService.querExprent();


        return list;
    }


    @RequestMapping("querExprentList")
    @ResponseBody
    public List<Guandian> querExprentList(Guandian guandian){


        List<Guandian> list1 = exprentViewService.querExprentList();


        return list1;
    }





}
