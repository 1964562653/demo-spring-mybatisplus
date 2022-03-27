package com.example.demospringmybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;


@Data
@NoArgsConstructor //生成无参构造函数
@AllArgsConstructor //生成全参数构造函数
@ToString
@TableName(value = "user") //指定查询的表名为user
public class User {
    // 以下为 mybatis-plus测试
    private Integer id;
    private String name;
    private String password;
    private String sex;
    private Date createTime;
    private Date updateTime;
}
