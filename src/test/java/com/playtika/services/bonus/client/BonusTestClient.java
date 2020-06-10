package com.playtika.services.bonus.client;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BonusTestClient {

    private final BonusClient bonusClient;

    public String getAllBonuses(){
        return bonusClient.getAllBonuses();
    }
}
