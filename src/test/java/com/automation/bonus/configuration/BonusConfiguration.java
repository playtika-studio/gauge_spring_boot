package com.automation.bonus.configuration;

import com.automation.bonus.client.BonusClient;
import com.automation.bonus.client.BonusTestClient;
import com.automation.bonus.steps.BonusSteps;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BonusConfiguration {

    @Bean
    public BonusTestClient bonusTestClient(BonusClient bonusClient){
        return new BonusTestClient(bonusClient);
    }

    @Bean
    public BonusSteps bonusSteps(BonusTestClient bonusTestClient){
        return new BonusSteps(bonusTestClient);
    }
}
