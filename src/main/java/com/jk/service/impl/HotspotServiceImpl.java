package com.jk.service.impl;

import com.jk.bean.Hotspot;
import com.jk.mapper.HotspotMapper;
import com.jk.service.HotspotService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotspotServiceImpl implements HotspotService {

    @Resource
    private HotspotMapper hotspotMapper;

    @Override
    public List<Hotspot> queryHotspot() {
        return hotspotMapper.queryHotspot();
    }

    @Override
    public List<Hotspot> queryHotspotChildren(Integer id) {
        return hotspotMapper.queryHotspotChildren(id);
    }
}
