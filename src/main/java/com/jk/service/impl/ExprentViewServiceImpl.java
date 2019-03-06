package com.jk.service.impl;


import com.jk.bean.Guandian;
import com.jk.mapper.ExprentViewMapper;
import com.jk.service.ExprentViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExprentViewServiceImpl implements ExprentViewService{

    @Autowired
    ExprentViewMapper exprentViewMapper;


    @Override
    public List<Guandian> querExprent() {
        return exprentViewMapper.querExprent();
    }

    @Override
    public Guandian querExprentList(Integer id) {
        return exprentViewMapper.querExprentList(id);
    }


}
