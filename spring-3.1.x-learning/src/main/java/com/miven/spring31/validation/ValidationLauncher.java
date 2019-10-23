package com.miven.spring31.validation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * 校验启动类
 * @author mingzhi.xie
 * @date 2019/10/23
 * @since 1.0
 */
@Configuration
@ComponentScan("com.miven.spring31.validation")
public class ValidationLauncher {

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
