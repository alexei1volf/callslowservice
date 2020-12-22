package com.example.dashboard;

import com.example.dashboard.dto.CoronaDashboardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CoronaDashboardService {

    private final CoronaSummaryService coronaSummaryService;

    public Mono<CoronaDashboardDto> getCoronaDashboardData() {
        return coronaSummaryService.getCoronaSummary()
                .map(s -> CoronaDashboardDto.builder().confirmedCases(s.getConfirmedCases()).build());
    }
}
