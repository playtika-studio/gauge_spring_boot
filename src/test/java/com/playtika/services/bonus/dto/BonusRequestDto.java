package com.playtika.services.bonus.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder
public class BonusRequestDto {

    String bonusName;
    String bonusType;

    Date startTime;
    Date endTime;
}
