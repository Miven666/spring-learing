package com.miven.spring.custom.beans.factory.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * 单例bean注册表 学习
 * @author mingzhi.xie
 * @date 2020/4/21
 * @since 1.0
 * @see SingletonBeanRegistry
 * @see ConfigurableBeanFactory
 */
public class SingletonBeanRegistryLearning {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.miven.spring.custom.beans.factory.config.component");
        context.refresh();
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        // 查找所有依赖 B 的组件
        String[] dependentBeans = beanFactory.getDependentBeans("componentB");
        System.out.println(Arrays.toString(dependentBeans));

        // 查找 B 组件依赖的所有bean
        String[] dependenciesForBean = beanFactory.getDependenciesForBean("componentB");
        System.out.println(Arrays.toString(dependenciesForBean));


    }
}
