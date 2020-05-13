package com.miven.spring.custom.beans.circular;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 循环依赖学习
 * @author mingzhi.xie
 * @date 2020/5/13
 * @since 1.0
 */
public class CircularReferencesLearning {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.miven.spring.custom.beans.circular");
        context.refresh();
        CircularA circularA = context.getBean(CircularA.class);
        System.out.println(circularA.getCircularB());
        CircularB circularB1 = context.getBean(CircularB.class);
        System.out.println(circularB1);
        CircularB circularB2 = context.getBean(CircularB.class);
        System.out.println(circularB2);
        context.close();
    }
}
