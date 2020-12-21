package com.example.provider;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CoronaSummaryService {

    @SneakyThrows
    public CoronaSummaryDto getCoronaSummary() {
        Random random = new Random();

        int minConfirmedCases = 72_196_732;
        int maxConfirmedCases = 75_000_000;
        int confirmedCases = random.nextInt(maxConfirmedCases - minConfirmedCases) + minConfirmedCases;

        int minDeaths = 1_630_521;
        int maxDeaths = 2_000_000;
        int deaths = random.nextInt(maxDeaths - minDeaths) + minDeaths;

        Thread.sleep(1000);

        return CoronaSummaryDto.builder()
                .confirmedCases(confirmedCases)
                .deaths(deaths)
                .build();
    }
}
