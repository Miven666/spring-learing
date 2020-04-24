package com.miven.demo;

import org.springframework.context.annotation.Bean;

/**
 * @author mingzhi.xie
 * @date 2020/4/24
 * @since 1.0
 */
public class DemoRegularComponentA {

    @Bean
    public DemoRegularComponentC demoRegularComponentC() {
        return new DemoRegularComponentC();
    }
}
