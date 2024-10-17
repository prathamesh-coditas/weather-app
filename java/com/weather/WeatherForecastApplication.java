package com.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the Weather Forecast application.
 * This class serves as the entry point for the Spring Boot application.
 */
@SpringBootApplication
public class WeatherForecastApplication {

    /**
     * The main method which serves as the entry point for the application.
     * It uses Spring Boot's SpringApplication to bootstrap and launch the application.
     *
     * @param args command line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(WeatherForecastApplication.class, args);
    }
}
