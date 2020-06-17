package com.playtika.services.bonus.client;

import com.playtika.services.bonus.dto.BonusRequestDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BonusTestClient {

    private final BonusClient bonusClient;

    public String getAllBonuses(){
        return bonusClient.getAllBonuses();
    }

    public void createNewBonus(BonusRequestDto bonusRequestDto){
        bonusClient.createNewBonus(bonusRequestDto);
    }
}
