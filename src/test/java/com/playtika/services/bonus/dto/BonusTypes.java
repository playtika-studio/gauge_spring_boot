package com.playtika.services.bonus.dto;

import lombok.Getter;

@Getter
public enum BonusTypes {

    MEGA_BONUS("Mega Bonus",10),
    SUPER_BONUS("Super Bonus",11),
    PLAYTIKA_BONUS("Play",666);

    private String bonusName;
    private Integer bonusId;

    BonusTypes(String bonusName, Integer bonusId){
        this.bonusName=bonusName;
        this.bonusId=bonusId;
    }
}
