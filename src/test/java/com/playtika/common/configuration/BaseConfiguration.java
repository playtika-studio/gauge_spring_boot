package com.playtika.common.configuration;

import com.playtika.bonus.configuration.BonusConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties
@Import(BonusConfiguration.class)
@EnableFeignClients(basePackages = {"com.playtika"})
@EnableEurekaClient
public class BaseConfiguration {

}
