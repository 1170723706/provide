package com.jk.controller;

import com.jk.bean.Example;
import com.jk.bean.PingLun;
import com.jk.bean.PingLunTwo;
import com.jk.bean.User;
import com.jk.service.BckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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
    public void addPingLun(PingLun pingLun, HttpSession session){

        User user = (User)session.getAttribute("user");
        if(user!=null){
            pingLun.setName(user.getUsername());
            pingLun.setImg(user.getImg());
        }
        mongoTemplate.save(pingLun);
    }

    @ResponseBody
    @RequestMapping("addPingLun2")
    public void addPingLun2(PingLunTwo pingLun, HttpSession session){

        User user = (User)session.getAttribute("user");
        if(user!=null){
            pingLun.setName(user.getUsername());
            pingLun.setImg(user.getImg());
        }
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
    @RequestMapping("queryPingLun2")
    public List<PingLunTwo> queryPingLun2(Integer id){

        Query query = new Query();
        query.addCriteria(Criteria.where("em_id").is(id));
        List<PingLunTwo> pingLuns = mongoTemplate.find(query, PingLunTwo.class);
        return pingLuns;
    }


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
