package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *小说中心：(NovelCenter)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "NovelCenter")
public class NovelCenter implements Serializable {

    //NovelCenter编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "novel_center_id")
    private Integer novel_center_id;
    // 小说编号
    @Basic
    private String novel_number;
    // 小说类型
    @Basic
    private String novel_type;
    // 小说名称
    @Basic
    private String novel_name;
    // 小说下载
    @Basic
    private String novel_download;
    // 作者
    @Basic
    private String author;
    // 上市时间
    @Basic
    private Timestamp time_to_market;
    // 封面
    @Basic
    private String cover;
    // 小说简介
    @Basic
    private String introduction_to_the_novel;
    // 小说内容
    @Basic
    private String novel_content;
    // 点击数
    @Basic
    private Integer hits;
    // 点赞数
    @Basic
    private Integer praise_len;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
