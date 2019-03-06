package com.jk.controller;

import com.jk.bean.Example;
import com.jk.service.BckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("bck")
public class BckController {

    @Resource
    BckService bckService;

    @ResponseBody
    @RequestMapping("queryExample1")
    public List<Example> queryExample1(){

        List<Example> list = new ArrayList<>();

        List<Example> ruslt = bckService.queryExample();

        for (int i=0;i<ruslt.size();i++) {
            if(i<=2){
                list.add(ruslt.get(i));
            }else{
                continue;
            }
        }


        return list;
    }

    @ResponseBody
    @RequestMapping("queryExample2")
    public List<Example> queryExample2(){

        List<Example> list = new ArrayList<>();

        List<Example> ruslt = bckService.queryExample();

        for (int i=0;i<ruslt.size();i++) {
            if(i>2){
                list.add(ruslt.get(i));
            }else{
                continue;
            }
        }
        return list;
    }



}
