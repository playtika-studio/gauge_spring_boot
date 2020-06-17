package com.playtika.services.bonus.client;

import com.playtika.services.bonus.dto.BonusRequestDto;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "bonus-service")
public interface BonusClient {

    @GetMapping("/bonus/getAllBonuses")
    public String getAllBonuses();

    @PostMapping("/bonus/addBonus")
    public void createNewBonus(@RequestBody BonusRequestDto bonusRequestDto);
}
