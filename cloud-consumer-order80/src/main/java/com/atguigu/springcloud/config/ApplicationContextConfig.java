package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zsy
 * @version 1.0
 * @date 2020/4/13 23:52
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
    @LoadBalanced  //赋予负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
