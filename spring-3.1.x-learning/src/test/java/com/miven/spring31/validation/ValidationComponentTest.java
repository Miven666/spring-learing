package com.miven.spring31.validation;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ValidationException;

@Slf4j
public class ValidationComponentTest extends ValidationLauncherTest{
    @Autowired
    private ValidationComponent validationComponent;

    @Test
    public void validatedPojo() {
        try {
            validationComponent.validatedPojo(super.fruit);
            log.warn("@Validated 和 @Validated 组合方式无效");
        } catch (ValidationException ve) {
            log.warn("@Validated 和 @Validated 组合方式生效了");
        }
    }

    @Test
    public void validPojo() {
        try {
            validationComponent.validPojo(super.fruit);
            log.warn("@Validated 和 @Valid 组合方式无效");
        } catch (ValidationException ve) {
            log.warn("@Validated 和 @Valid 组合方式生效了");
        }
    }
}