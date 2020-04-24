package com.miven.spring.custom.context.annotation.enable;

import com.miven.demo.DemoRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author mingzhi.xie
 * @date 2020/4/24
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(DemoRegistrar.class)
public @interface EnableDemoRegistrar {
}
