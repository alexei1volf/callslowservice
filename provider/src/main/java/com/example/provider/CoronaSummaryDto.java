package com.example.provider;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CoronaSummaryDto {
    private Integer confirmedCases;
    private Integer deaths;
}
