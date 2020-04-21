package com.miven.spring.custom.beans.factory.config.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mingzhi.xie
 * @date 2020/4/21
 * @since 1.0
 */
@Component
public class componentAA {

    @Autowired
    private ComponentB componentB;
}
