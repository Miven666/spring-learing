package com.miven.spring.custom.context.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mingzhi.xie
 * @date 2020/4/26
 * @since 1.0
 */
@Configuration
public class ConfigurationD {


    @Configuration
    protected static class ConfigurationDD {

        @Bean
        public ConfigurationDDD configurationDDD() {
            return new ConfigurationDDD();
        }
    }
}
