package com.miven.spring.custom.beans.factory.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * 单例bean注册表 学习
 *
 * @author mingzhi.xie
 * @date 2020/4/21
 * @since 1.0
 * @see Lifecycle
 * @see SmartLifecycle
 * @see SingletonBeanRegistry
 * @see ConfigurableBeanFactory
 */
public class SingletonBeanRegistryLearning {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        context.scan("com.miven.spring.custom.beans.factory.config.component");

        // 上下文刷新 -> SmartLifecycle
        context.refresh();
        System.out.println("上下文刷新完成");

        // 上下文启动 -> Lifecycle#start()
        context.start();

        // 查找依赖B的beans
        String[] dependentBeans = beanFactory.getDependentBeans("componentB");
        System.out.println("依赖B的beans: " + Arrays.toString(dependentBeans));

        // 查找B依赖的beans
        String[] dependenciesForBean = beanFactory.getDependenciesForBean("componentB");
        System.out.println("B依赖的bean: " + Arrays.toString(dependenciesForBean));


        // 这几个关闭方式都会执行stop
        // 上下文停止 -> Lifecycle#stop()
        // context.stop();
        // context.destroy();
        // 上下文关闭 -> Lifecycle#stop()
        context.close();
    }
}
