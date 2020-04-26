package com.miven.spring.custom.context.annotation.configuration;

import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * ConfigurationDDD 创建时间比默认要早了
 *
 * @author mingzhi.xie
 * @date 2020/4/26
 * @since 1.0
 */
@Configuration
public class ConfigurationDDDD {

    @Resource
    private ConfigurationDDD configurationDDD;
}
