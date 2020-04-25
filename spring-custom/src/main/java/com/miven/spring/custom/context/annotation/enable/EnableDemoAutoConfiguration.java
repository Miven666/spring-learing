package com.miven.spring.custom.context.annotation.enable;

import java.lang.annotation.*;

/**
 * @author mingzhi.xie
 * @date 2020/4/25
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableDemoAutoConfiguration {
}
