package com.example.dashboard;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CachingService {

    private final CacheManager cacheManager;

    @Scheduled(fixedRate = 10000)
    public void evictAllCachesAtIntervals() {
        cacheManager.getCacheNames()
                .forEach(cacheName -> cacheManager.getCache(cacheName).clear());
    }

}

