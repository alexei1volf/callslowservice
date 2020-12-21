package com.example.provider;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CoronaSummaryService {

    @Value("${successProbability}")
    private int successProbability;

    @SneakyThrows
    public CoronaSummaryDto getCoronaSummary() {
        Random random = new Random();

        int minConfirmedCases = 72_196_732;
        int maxConfirmedCases = 75_000_000;
        int confirmedCases = random.nextInt(maxConfirmedCases - minConfirmedCases) + minConfirmedCases;

        int minDeaths = 1_630_521;
        int maxDeaths = 2_000_000;
        int deaths = random.nextInt(maxDeaths - minDeaths) + minDeaths;

        boolean success = random.nextInt(100) < successProbability;

        Thread.sleep(1000);

        return CoronaSummaryDto.builder()
                .confirmedCases(confirmedCases)
                .deaths(deaths)
                .success(success)
                .build();
    }
}
