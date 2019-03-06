package com.jk.service;

import com.jk.bean.Hotspot;

import java.util.List;

public interface HotspotService {

    List<Hotspot> queryHotspot();


    Hotspot queryHotspotChildren(Hotspot hotspot);
}
