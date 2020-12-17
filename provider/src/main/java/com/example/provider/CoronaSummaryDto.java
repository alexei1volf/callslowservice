package com.example.provider;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CoronaSummaryDto {
    private Long confirmedCases;
    private Long deaths;
}
