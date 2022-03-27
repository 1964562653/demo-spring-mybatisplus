package com.example.demospringmybatisplus.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demospringmybatisplus.pojo.User;
import org.springframework.stereotype.Repository;

@DS("mysql1")
@Repository("UserMapper")
public interface UserMapper extends BaseMapper<User> {
}
