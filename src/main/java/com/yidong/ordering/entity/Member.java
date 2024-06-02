package com.yidong.ordering.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Member {

    private String id;
    private String name;
    private int age;
    private String img;
    private int sex;
    private String address;
    private String job;
    private String creatName;
    private Date creatTime;
    private String updateName;
    private Date updateTime;
}
