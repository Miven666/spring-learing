package com.miven.spring3.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *  自定义 bean 后置处理器
 * @author mingzhi.xie
 * @date 2019/9/20
 * @since 1.0
 */
@Slf4j
public class CustomBeanPostProcess implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("{} before process by CustomBeanPostProcess", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("{} after process by CustomBeanPostProcess", beanName);
        return bean;
    }
}
