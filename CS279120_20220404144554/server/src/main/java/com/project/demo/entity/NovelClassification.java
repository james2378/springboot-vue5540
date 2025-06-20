package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *小说分类：(NovelClassification)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "NovelClassification")
public class NovelClassification implements Serializable {

    //NovelClassification编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "novel_classification_id")
    private Integer novel_classification_id;
    // 小说类型
    @Basic
    private String novel_type;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
