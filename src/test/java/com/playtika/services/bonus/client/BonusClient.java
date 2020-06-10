package com.playtika.services.bonus.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "bonus-service",
                url = "http://localhost:8080/bonus")
public interface BonusClient {

    @GetMapping("/getAllBonuses")
    public String getAllBonuses();
}
