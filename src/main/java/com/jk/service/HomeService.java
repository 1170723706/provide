package com.jk.service;

import com.jk.bean.Exprent;
import com.jk.bean.WenZhang;

import java.util.List;

public interface HomeService {
    List<Exprent> getzhuanjia();

    List<Exprent> getzanmei();

    List<WenZhang> getTitle();
}
