package com.miven.spring.custom.context.annotation.regular;

import org.springframework.context.annotation.Bean;

/**
 * @author mingzhi.xie
 * @date 2020/4/24
 * @since 1.0
 */
public class RegularB {

    @Bean
    public RegularC regularC() {
        return new RegularC();
    }
}
