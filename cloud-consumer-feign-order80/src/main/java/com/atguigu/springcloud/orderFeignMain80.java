package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zsy
 * @version 1.0
 * @date 2020/4/20 20:47
 */
@SpringBootApplication
@EnableFeignClients
public class orderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(orderFeignMain80.class,args);
    }
}
