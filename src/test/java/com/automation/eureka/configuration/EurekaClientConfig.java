package com.automation.eureka.configuration;

import com.automation.eureka.client.EurekaTestClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EurekaClientConfig {

    @Bean
    public EurekaTestClient eurekaTestClient(EurekaClient eurekaClient) {
        return new EurekaTestClient(eurekaClient);
    }
}
