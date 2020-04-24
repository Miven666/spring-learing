package com.miven.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mingzhi.xie
 * @date 2020/4/24
 * @since 1.0
 */
@Configuration
public class DemoConfigurationA {

    @Bean
    public DemoRegularComponentB demoRegularComponentB() {
        return new DemoRegularComponentB();
    }
}
