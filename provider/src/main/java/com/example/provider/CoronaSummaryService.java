package com.example.provider;

import org.springframework.stereotype.Service;

@Service
public class CoronaSummaryService {

    public CoronaSummaryDto getCoronaSummary() {
        return CoronaSummaryDto.builder()
                .confirmedCases(72_196_732L)
                .deaths(1_630_521L)
                .build();
    }
}
