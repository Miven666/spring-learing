package com.miven.spring.custom.context.annotation;

import com.miven.spring.custom.context.annotation.lazy.LazyComponent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author mingzhi.xie
 * @date 2020/4/27
 * @since 1.0
 */
public class LazyLearning {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.miven.spring.custom.context.annotation.lazy");
        context.refresh();

        LazyComponent bean = context.getBean("lazyComponent", LazyComponent.class);
        System.out.println(bean);

        context.close();
    }
}
