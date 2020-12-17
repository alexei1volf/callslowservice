package com.example.dashboard;

import com.example.dashboard.dto.CoronaDashboardDto;
import com.example.dashboard.dto.CoronaSummaryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoronaDashboardService {

    private final CoronaSummaryService coronaSummaryService;

    public CoronaDashboardDto getCoronaDashboardData() {
        CoronaSummaryDto coronaSummary = coronaSummaryService.getCoronaSummary();
        return CoronaDashboardDto.builder()
                .confirmedCases(coronaSummary.getConfirmedCases())
                .build();
    }
}
