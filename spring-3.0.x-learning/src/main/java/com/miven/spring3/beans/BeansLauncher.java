package com.miven.spring3.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  启动类
 * @author mingzhi.xie
 * @date 2019/9/18
 * @since 1.0
 */
@Slf4j
@Configuration
public class BeansLauncher {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.miven");
        applicationContext.getBeanFactory().addBeanPostProcessor(new CustomBeanPostProcess());
        applicationContext.refresh();
        BeansLauncher beansLauncher = applicationContext.getBean(BeansLauncher.class);
        log.info("Class type is {}", beansLauncher.getClass().getName());
        CustomBean customBean = applicationContext.getBean(CustomBean.class);
        log.info("Class type is {}", customBean.getClass().getName());
    }

    @Bean
    public CustomBean customBean() {
        return new CustomBean();
    }
}
