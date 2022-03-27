package com.example.demospringmybatisplus.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demospringmybatisplus.pojo.User2;
import org.springframework.stereotype.Repository;

@DS("mysql2")
@Repository("User2Mapper")
public interface User2Mapper extends BaseMapper<User2> {
}
