package com.example.dashboard;

import com.example.dashboard.dto.CoronaDashboardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/corona-dashboard", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CoronaDashboardController {

    private final CoronaDashboardService coronaDashboardService;

    @RequestMapping(method = RequestMethod.GET)
    public CoronaDashboardDto getCoronaDashboardData() {
        return coronaDashboardService.getCoronaDashboardData();
    }
}
