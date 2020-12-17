package com.example.callslowservice;

import org.springframework.stereotype.Service;

@Service
public class AggregatedDataService {

    public AggregatedDataDto getAggregatedData() {
        return AggregatedDataDto.builder()
                .name("my favorite number")
                .value(17)
                .build();
    }
}
