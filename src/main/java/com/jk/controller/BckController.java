package com.jk.controller;

import com.jk.bean.Example;
import com.jk.bean.PingLun;
import com.jk.service.BckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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

    @Autowired
    MongoTemplate mongoTemplate;

    @ResponseBody
    @RequestMapping("addPingLun")
    public void addPingLun(PingLun pingLun){

        mongoTemplate.save(pingLun);
    }

    @ResponseBody
    @RequestMapping("queryPingLun")
    public List<PingLun> queryPingLun(Integer id){

        Query query = new Query();
        query.addCriteria(Criteria.where("em_id").is(id));
        List<PingLun> pingLuns = mongoTemplate.find(query, PingLun.class);
        return pingLuns;
    }


    @ResponseBody
    @RequestMapping("queryExample1")
    public List<Example> queryExample1(Integer page, Integer rows){
        List<Example> list = bckService.queryExample(page,rows);
        return list;
    }

    @ResponseBody
    @RequestMapping("queryExampleById")
    public Example queryExampleById(Integer id){

        return  bckService.queryExampleById(id);
    }

    @ResponseBody
    @RequestMapping("updateById")
    public void updateById(Integer id){
       bckService.updateById(id);
    }



}
