package com.playtika.services.bonus.configuration;


import com.playtika.services.bonus.client.BonusClient;
import com.playtika.services.bonus.client.BonusTestClient;
import com.playtika.services.bonus.steps.BonusSteps;
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
