package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zsy
 * @version 1.0
 * @date 2020/4/19 17:18
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myrule(){
        return new RandomRule();
    }
}
