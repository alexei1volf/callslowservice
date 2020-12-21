package com.example.dashboard.dto;

import lombok.Data;

@Data
public class CoronaSummaryDto {
    private Integer confirmedCases;
    private Integer deaths;
    private Boolean success;
}
