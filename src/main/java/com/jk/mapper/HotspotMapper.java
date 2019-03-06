package com.jk.mapper;

import com.jk.bean.Hotspot;

import java.util.List;

public interface HotspotMapper {

    List<Hotspot> queryHotspot();

    List<Hotspot> queryHotspotChildren(Integer id);
}
