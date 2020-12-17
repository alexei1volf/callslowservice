package com.example.callslowservice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AggregatedDataDto {
    private String name;
    private Integer value;
}
