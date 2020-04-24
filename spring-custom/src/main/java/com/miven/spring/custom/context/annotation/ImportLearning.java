package com.miven.spring.custom.context.annotation;

import com.miven.spring.custom.beans.factory.config.component.ComponentA;
import com.miven.spring.custom.context.annotation.enable.EnableDemoImportSelector;
import com.miven.spring.custom.context.annotation.enable.EnableDemoRegistrar;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * 学习 {@link Import} 注解
 * @author mingzhi.xie
 * @date 2020/4/24
 * @since 1.0
* @see Import
 */
@EnableDemoImportSelector
@EnableDemoRegistrar
public class ImportLearning {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.miven.spring.custom");
        context.refresh();

        ComponentA a = context.getBean("componentA", ComponentA.class);
        System.out.println(a.getClass().getName());
    }
}
