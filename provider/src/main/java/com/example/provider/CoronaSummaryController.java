package com.example.provider;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/corona-summary", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CoronaSummaryController {

    private final CoronaSummaryService coronaDashboardService;

    @RequestMapping(method = RequestMethod.GET)
    public CoronaSummaryDto getCoronaDashboardData() {
        return coronaDashboardService.getCoronaSummary();
    }
}
