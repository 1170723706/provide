package com.jk.controller;

import com.jk.bean.Hotspot;
import com.jk.service.HotspotService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("rdzx")
public class HotspotController {

    @Resource
    private HotspotService hotspotService;

    @RequestMapping("queryHotspot")
    public List<Hotspot> queryHotspot() {

        List<Hotspot> list=hotspotService.queryHotspot();
        return list;
    }

    @RequestMapping("queryHotspotChildren")
    public Hotspot queryHotspotChildren(Hotspot hotspot) {

        Hotspot hotspots=hotspotService.queryHotspotChildren(hotspot);
        return hotspots;
    }

}
