package com.miven.spring.custom.context.annotation.lazy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author mingzhi.xie
 * @date 2020/4/27
 * @since 1.0
 */
@Lazy
@Getter
@Setter
@ToString
@Component
public class LazyComponent {

    private String name = "lazy-component-test";

}
