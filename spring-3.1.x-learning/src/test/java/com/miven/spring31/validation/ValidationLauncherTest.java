package com.miven.spring31.validation;

import com.alibaba.fastjson.JSON;
import com.miven.entity.Fruit;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ValidationLauncher.class})
public class ValidationLauncherTest {

    Fruit fruit;

    @Before
    public void setUp() {
        fruit = new Fruit();
        fruit.setId(1);
    }

    @Test
    public void main() {
        log.info(JSON.toJSONString(fruit));
    }
}