package com.miven.spring.custom.context.annotation.configuration;

import com.miven.spring.custom.context.annotation.regular.RegularA;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author mingzhi.xie
 * @date 2020/4/24
 * @since 1.0
 */
@Import(RegularA.class)
@Configuration
public class ConfigurationA {

}
