package com.wusuiwei.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 用户管理服务
 *
 * @author SUIWEI WU
 * @date 2021/7/23 12:02
 */
@MapperScan("com.wusuiwei.user.daos")
@SpringBootApplication
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
