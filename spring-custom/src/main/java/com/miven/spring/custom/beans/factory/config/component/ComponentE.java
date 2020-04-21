package com.miven.spring.custom.beans.factory.config.component;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @author mingzhi.xie
 * @date 2020/4/21
 * @since 1.0
 */
@Component
public class ComponentE extends AbstractLifecycle implements SmartLifecycle {

    public ComponentE() {
        super("E");
    }

    /**
     * false时不会在上下文刷新阶段就自动启动（不机智了）
     */
    @Override
    public boolean isAutoStartup() {
        return false;
    }

    /**
     * 当自动启动isAutoStartup为false时，SmartLifecycle和普通的Lifecycle差不多
     * 都是在上下文start()阶段启动，此时阶段phase值越小越优先，对应的stop()也就越靠后
     */
    @Override
    public int getPhase() {
        return -1;
    }

    /**
     * 如果不主动调用stop(),关闭阶段只执行该方法
     */
    @Override
    public void stop(Runnable callback) {
        // stop();
        System.out.println("组件E停止，并执行回调......");
        callback.run();
    }
}
