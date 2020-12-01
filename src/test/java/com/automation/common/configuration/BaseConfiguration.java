package com.automation.common.configuration;

import com.automation.bonus.configuration.BonusConfiguration;
import com.automation.eureka.configuration.EurekaClientConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties
@Import(value = {BonusConfiguration.class, EurekaClientConfig.class})
@EnableFeignClients(basePackages = {"com.automation"})
@EnableEurekaClient
public class BaseConfiguration {

}