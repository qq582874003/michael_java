package com.michael.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * desc
 *
 * @author wangc 2021-10-06
 * @since 1.0.0
 */
@Configuration
@ComponentScan(basePackages = {"com.michael"})
public class SpringConfig {
}
