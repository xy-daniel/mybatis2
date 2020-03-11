package org.javaboy.manydataresourcemybatis;

import org.javaboy.manydataresourcemybatis.mapper1.UserMapper1;
import org.javaboy.manydataresourcemybatis.mapper2.UserMapper2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManydataresourcemybatisApplicationTests {

    @Autowired(required = false)
    UserMapper1 userMapper1;
    @Autowired(required = false)
    UserMapper2 userMapper2;

    @Test
    void contextLoads() {
        System.out.println(userMapper1.getAllUsers());
        System.out.println(userMapper2.getAllUsers());
    }

}
