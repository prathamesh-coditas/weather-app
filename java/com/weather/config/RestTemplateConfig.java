package com.weather.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Configuration class for setting up RestTemplate bean.
 * This class provides a centralized configuration for creating and managing RestTemplate instances.
 */
@Configuration
public class RestTemplateConfig {

    /**
     * Creates and configures a RestTemplate bean.
     * This method is responsible for instantiating a new RestTemplate object,
     * which can be used throughout the application for making HTTP requests.
     *
     * @return a new instance of RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
