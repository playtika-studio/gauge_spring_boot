package com.playtika.bonus.configuration;

import com.playtika.bonus.client.BonusClient;
import com.playtika.bonus.client.BonusTestClient;
import com.playtika.bonus.steps.BonusSteps;
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
