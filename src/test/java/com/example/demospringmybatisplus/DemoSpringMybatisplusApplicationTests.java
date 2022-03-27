package com.example.demospringmybatisplus;

import com.example.demospringmybatisplus.mapper.User2Mapper;
import com.example.demospringmybatisplus.mapper.UserMapper;
import com.example.demospringmybatisplus.pojo.User;
import com.example.demospringmybatisplus.pojo.User2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSpringMybatisplusApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    User2Mapper user2Mapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectById(1);
        System.out.println(user.toString());
        User2 user2 = user2Mapper.selectById(1);
        System.out.println(user2.toString());
    }

}
