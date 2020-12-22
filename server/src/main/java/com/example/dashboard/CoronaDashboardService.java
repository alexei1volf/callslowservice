package com.example.dashboard;

import com.example.dashboard.dto.CoronaDashboardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoronaDashboardService {

    private final CoronaSummaryService coronaSummaryService;

    public CoronaDashboardDto getCoronaDashboardData() {
        coronaSummaryService.getCoronaSummary().subscribe(System.out::println);
        return CoronaDashboardDto.builder()
                .confirmedCases(1)
                .build();
    }
}
