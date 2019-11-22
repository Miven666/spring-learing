package com.miven.spring31.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import java.beans.PropertyDescriptor;

/**
 * Bean 后置处理器生命周期探究
 * @author mingzhi.xie
 * @date 2019/10/30
 * @since 1.0.5
 */
@Slf4j
public class BeanPostProcessorLifecycle implements InstantiationAwareBeanPostProcessor, EnvironmentAware {

    private boolean postProcessBeforeInitialization = false;
    private boolean postProcessAfterInitialization = false;
    private boolean postProcessBeforeInstantiation = false;
    private boolean postProcessAfterInstantiation = false;
    private boolean postProcessProperties = false;

    @Override
    public void setEnvironment(Environment environment) {
        String[] profiles = environment.getActiveProfiles();
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (!postProcessBeforeInstantiation) {
            System.out.println(beanName + ">>>>>>>>postProcessBeforeInstantiation>>>>>>>11111111");
            postProcessBeforeInstantiation = true;
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (!postProcessAfterInstantiation) {
            System.out.println(beanName + ">>>>>>>>postProcessAfterInstantiation>>>>>>222222222222");
            postProcessAfterInstantiation = true;
        }
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if (!postProcessProperties) {
            System.out.println(beanName + ">>>>>>>>postProcessPropertyValues>>>>>>>>>>>333333333333333333");
            postProcessProperties = true;
        }
        return pvs;
    }
    //
    // @Override
    // public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
    //     if (!postProcessProperties) {
    //         System.out.println(beanName + ">>>>>>>>postProcessProperties>>>>>>>>>>>333333333333333333");
    //         postProcessProperties = true;
    //     }
    //     return pvs;
    // }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (!postProcessBeforeInitialization) {
            System.out.println(beanName + ">>>>>>>>postProcessBeforeInitialization>>>>>>>>>>>44444444444444");
            postProcessBeforeInitialization = true;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (!postProcessAfterInitialization) {
            System.out.println(beanName + ">>>>>>>>postProcessAfterInitialization>>>>>>5555555555555555");
            postProcessAfterInitialization = true;
        }
        return bean;
    }
}
