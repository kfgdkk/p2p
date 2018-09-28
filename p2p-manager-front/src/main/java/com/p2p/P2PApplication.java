package com.p2p;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2018/9/27 0027.
 */
@SpringBootApplication
@ComponentScan("com.p2p")
@MapperScan("com.p2p.mapper")
public class P2PApplication {
    public static void main(String[] args) {
        SpringApplication.run(P2PApplication.class);
    }
}
