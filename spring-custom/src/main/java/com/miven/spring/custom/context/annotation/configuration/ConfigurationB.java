package com.miven.spring.custom.context.annotation.configuration;

import com.miven.demo.DemoConfigurationA;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author mingzhi.xie
 * @date 2020/4/24
 * @since 1.0
 */
@Import(DemoConfigurationA.class)
@Configuration
public class ConfigurationB {
}
