package com.example.dashboard;

import com.example.dashboard.dto.CoronaSummaryDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CoronaSummaryService {

    public CoronaSummaryDto getCoronaSummary() {
        String uriString = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("localhost")
                .port(8090)
                .path("corona-summary")
                .build()
                .toUriString();
        return new RestTemplate().getForObject(uriString, CoronaSummaryDto.class);
    }
}
