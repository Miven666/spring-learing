package com.miven.spring.custom.context.annotation.configuration;

import com.miven.spring.custom.context.annotation.regular.RegularA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 在扫描路径内通过{@link Configuration} 注解注册的bean，要优先于其通过在
 * 类上添加{@link Import}注解注册的bean
 * 注意：不在扫描路径内（比如用{@link Import}将其导入）注册的bean(假设叫A)，此时被导入的这个bean其类上还有
 * {@link Import}导入的bean(假设叫B),这种情况 B 比 A 先创建
 *
 * 通过{@link Import}导入注册的bean，就和 {@link Configuration}注册的bean类似，其类中如果如果有
 * {@link Bean} 注册的bean，也会被创建，但{@link Bean}注册的这个bean内中写的{@link Bean}注册类是无效的
 * @author mingzhi.xie
 * @date 2020/4/24
 * @since 1.0
 */
@Import(RegularA.class)
@Configuration
public class ConfigurationA {

}
