package com.miven.spring.custom.beans.circular;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author mingzhi.xie
 * @date 2020/5/13
 * @since 1.0
 */
@Getter
@Setter
@Component
public class CircularA {

    @Resource
    private CircularB circularB;
}
