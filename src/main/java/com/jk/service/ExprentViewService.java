package com.jk.service;

import com.jk.bean.Guandian;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ExprentViewService {

    List<Guandian> querExprent();

    Guandian querExprentList(Integer id);
}
