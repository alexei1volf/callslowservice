package com.example.dashboard;

import com.example.dashboard.dto.CoronaSummaryDto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CoronaSummaryService {

    @HystrixCommand(groupKey = "CoronaSummary", threadPoolKey = "CoronaSummaryPool",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000"),
            },
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "1"),
                    @HystrixProperty(name = "maxQueueSize", value = "2")

            })
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
