package com.playtika.services.bonus.steps;

import com.playtika.services.bonus.client.BonusTestClient;
import com.thoughtworks.gauge.Step;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class BonusSteps {

    private final BonusTestClient bonusTestClient;

    @Step("Get all bonuses")
    public void getAllBonuses(){
        System.out.println("Bonuses are"+bonusTestClient.getAllBonuses());
    }
}
