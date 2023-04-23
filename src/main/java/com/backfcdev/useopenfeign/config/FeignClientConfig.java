package com.backfcdev.useopenfeign.config;

import static feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {
    @Bean
    Level feignLoggerLevel(){
        return Level.FULL;
    }
}
