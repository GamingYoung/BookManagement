package com.example.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity //将表名与类名对应
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//设置自增标签
    private Integer id;
    private String name;
    private String author;
}
