package com.example.provider;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
@RequiredArgsConstructor
public class CoronaSummaryController {

    private CoronaSummaryService coronaDashboardService;

    @Autowired
    public CoronaSummaryController(CoronaSummaryService coronaDashboardService) {
        this.coronaDashboardService = coronaDashboardService;
    }

    @MessageMapping("coronaSummary")
    public Flux<CoronaSummaryDto> getCoronaDashboardData() {
        return coronaDashboardService.getCoronaSummary();
    }
}
