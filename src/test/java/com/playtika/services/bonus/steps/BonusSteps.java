package com.playtika.services.bonus.steps;

import com.playtika.services.bonus.client.BonusTestClient;
import com.playtika.services.bonus.dto.BonusRequestDto;
import com.playtika.services.bonus.dto.BonusTypes;
import com.thoughtworks.gauge.Step;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.sql.Date;
import java.time.LocalDate;


@RequiredArgsConstructor
@Slf4j
public class BonusSteps {

    private final BonusTestClient bonusTestClient;

    @Step("Get all bonuses")
    public void getAllBonuses(){
        System.out.println("Bonuses are"+bonusTestClient.getAllBonuses());
    }

    @Step("Create new <bonusTypes> bonus")
    public void createNewBonus(BonusTypes bonusTypes){
        BonusRequestDto bonusRequestDto = BonusRequestDto.builder()
                .bonusName("New "+bonusTypes.getBonusName()+bonusTypes.getBonusId())
                .bonusType(bonusTypes.getBonusName())
                .startTime(Date.valueOf(LocalDate.now()))
                .endTime(Date.valueOf(LocalDate.now().plusDays(2))).build();

        bonusTestClient.createNewBonus(bonusRequestDto);
    }
}
