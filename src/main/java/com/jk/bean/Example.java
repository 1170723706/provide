package com.jk.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Example {

    private Integer id;
    private String em_title;
    private Integer em_zeid;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date em_createtime;
    private Integer em_browse;
    private Integer em_medal;
    private String em_img;
    private String em_mp3;
    private String em_content;
    private String dt_name;
    private String dt_img;
    private String dt_addr;
}
