package com.miven.spring.custom.beans.circular;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author mingzhi.xie
 * @date 2020/5/13
 * @since 1.0
 */
@Getter
@Component
@Scope("prototype")
public class CircularB {

    @Resource
    private CircularA circularA;

}
