package com.jk.service.impl;

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
    public List<Example> queryExample() {
        return bckMapper.queryExample();
    }
}
