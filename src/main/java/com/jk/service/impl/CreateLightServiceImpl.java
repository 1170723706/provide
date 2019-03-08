package com.jk.service.impl;

import com.jk.bean.CreateLight;
import com.jk.bean.ReceivePage;
import com.jk.bean.SendPage;
import com.jk.service.CreateLightService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CreateLightServiceImpl implements CreateLightService {

    @Resource
    private MongoTemplate mongoTemplate;

}
