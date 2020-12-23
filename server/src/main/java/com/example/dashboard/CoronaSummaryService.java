package com.example.dashboard;

import com.example.dashboard.dto.CoronaSummaryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CoronaSummaryService {

    private final RSocketRequester requester;

    public Flux<CoronaSummaryDto> getCoronaSummary() {
        return requester
                .route("coronaSummary")
                .retrieveFlux(CoronaSummaryDto.class);
    }
}
