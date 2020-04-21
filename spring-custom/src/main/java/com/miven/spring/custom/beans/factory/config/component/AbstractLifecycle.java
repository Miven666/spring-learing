package com.miven.spring.custom.beans.factory.config.component;

import org.springframework.context.Lifecycle;

/**
 * @author mingzhi.xie
 * @date 2020/4/21
 * @since 1.0
 */
public abstract class AbstractLifecycle implements Lifecycle {

    protected volatile String beanName;

    private volatile boolean running;

    public AbstractLifecycle(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void start() {
        System.out.println("组件" + beanName + "启动......");
        this.running = true;
    }

    @Override
    public void stop() {
        System.out.println("组件" + beanName + "停止......");
        this.running = false;
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }
}
