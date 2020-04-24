package com.miven.spring.custom.context.annotation.enable;

import com.miven.demo.DemoImportSelector;
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
@Import(DemoImportSelector.class)
public @interface EnableDemoImportSelector {

}
