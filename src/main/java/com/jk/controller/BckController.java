package com.jk.controller;

import com.jk.bean.Example;
import com.jk.service.BckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("bck")
public class BckController {

    @Resource
    BckService bckService;

    @ResponseBody
    @RequestMapping("queryExample1")
    public List<Example> queryExample1(Integer page, Integer rows) {
        List<Example> list = bckService.queryExample(page, rows);
        return list;
    }

    @ResponseBody
    @RequestMapping("queryExampleById")
    public Example queryExampleById(Integer id) {

        return bckService.queryExampleById(id);
    }

    @ResponseBody
    @RequestMapping("updateById")
    public void updateById(Integer id) {
        bckService.updateById(id);
    }


}
