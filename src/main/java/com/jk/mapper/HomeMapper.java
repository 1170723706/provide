package com.jk.mapper;

import com.jk.bean.Exprent;
import com.jk.bean.WenZhang;

import java.util.List;

public interface HomeMapper {
    List<Exprent> getzhuanjia();

    List<Exprent> getzanmei();

    List<WenZhang> getTitle();
}
