package com.jk.controller;

import com.github.pagehelper.PageHelper;
import com.jk.bean.Answer;
import com.jk.bean.Hotspot;
import com.jk.bean.User;
import com.jk.service.ChuangguanService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.awt.print.Book;
import java.util.List;

@RestController
public class ChuangguanController {

    @Resource
    private ChuangguanService chuangguanService;

    @Resource
    MongoTemplate mongoTemplate;

    @RequestMapping("queryChuangguan")
    public List<User> queryChuangguan(Integer page,Integer rows) {

        List<User> sum=chuangguanService.queryChuangguan();
        PageHelper.startPage(page,rows);
        List<User> list=chuangguanService.queryChuangguan();
        return list;
    }

    @ResponseBody
    @RequestMapping("findItme")
    public List<Answer> findItme() {

        List<Answer> find = mongoTemplate.find(null, Answer.class);
        return find;
    }

    @ResponseBody
    @RequestMapping("insertItme")
    public String insertItme(Answer answer) {

        answer.setId(6);
        answer.setContent("主任医师,住院医师,副主任医师,实习医生,在校院生,其他");
        answer.setTitle("您现在的职称是");
        mongoTemplate.insert(answer);
        System.out.println(answer);
        return "success";
    }









}