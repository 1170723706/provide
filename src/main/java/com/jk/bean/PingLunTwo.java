package com.jk.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "t_pinglun2")
@AllArgsConstructor
@NoArgsConstructor
public class PingLunTwo {
    String content;
    String name="匿名用户";
    Integer em_id;
    String img="https://mmb-toutiao.oss-cn-shanghai.aliyuncs.com/toutiaoImage/ee8d0b7e9e8e5a9f390f6be8856b868b.jpeg?x-oss-process=image/resize,w_440";
}
