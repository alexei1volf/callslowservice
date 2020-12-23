package com.example.dashboard;

import com.example.dashboard.dto.CoronaDashboardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
@RequiredArgsConstructor
public class CoronaDashboardController {

    private final CoronaDashboardService coronaDashboardService;

    @MessageMapping("corona-dashboard")
    public Flux<CoronaDashboardDto> getCoronaDashboardData() {
        return coronaDashboardService.getCoronaDashboardData();
    }
}
