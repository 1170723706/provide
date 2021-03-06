package com.jk.service.impl;

import com.github.pagehelper.PageHelper;
import com.jk.bean.Example;
import com.jk.mapper.BckMapper;
import com.jk.service.BckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BckServiceImpl implements BckService {

    @Resource
    BckMapper bckMapper;


    @Override
    public  List <Example> queryExample(Integer page, Integer rows) {
        List <Example> sum = bckMapper.queryExample(); //计算数据库符合条件的总条数 条数是固
        PageHelper.startPage(page,rows);
        List <Example> list = bckMapper.queryExample(); //当前页面数据 其大小取决于 每页多少条
        return list;
    }

    @Override
    public Example queryExampleById(Integer id) {
        return bckMapper.queryExampleById(id);
    }

    @Override
    public void updateById(Integer id) {
         bckMapper.updateById(id);
    }
}
