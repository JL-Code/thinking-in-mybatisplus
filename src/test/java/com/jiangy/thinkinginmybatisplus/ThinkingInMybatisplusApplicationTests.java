package com.jiangy.thinkinginmybatisplus;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class ThinkingInMybatisplusApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {
        System.out.println(dataSource.getClass());

        DruidDataSource ds = (DruidDataSource) dataSource;
        System.out.println(ds.getUrl());
        System.out.printf("初始化连接数:%s\n", ds.getInitialSize());
        System.out.printf("最大连接数:%s\n", ds.getMaxActive());

    }

}
