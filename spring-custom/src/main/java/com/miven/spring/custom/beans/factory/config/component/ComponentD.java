package com.miven.spring.custom.beans.factory.config.component;

import org.springframework.stereotype.Component;

/**
 * @author mingzhi.xie
 * @date 2020/4/21
 * @since 1.0
 */
@Component
public class ComponentD extends AbstractLifecycle {

    public ComponentD() {
        super("D");
    }


}
