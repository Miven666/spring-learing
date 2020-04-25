package com.miven.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author mingzhi.xie
 * @date 2020/4/25
 * @since 1.0
 */
@Import(DemoRegularComponentD.class)
@Configuration
public class DemoConfigurationB {
}
