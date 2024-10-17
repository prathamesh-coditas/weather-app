package com.weather.rest;

import com.weather.model.currentweather.ReadableWeather;
import com.weather.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for handling weather-related API requests.
 * This controller provides endpoints to retrieve current weather and forecast data.
 */
@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    /**
     * The WeatherService used to fetch weather data.
     */
    private final WeatherService weatherService;

    /**
     * Constructs a new WeatherController with the given WeatherService.
     *
     * @param weatherService the WeatherService to use for fetching weather data
     */
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    /**
     * Retrieves the current weather for a specified location.
     *
     * @param location the location to get weather for
     * @return a WeatherResponse object containing current weather data
     */
    @GetMapping("/current/{location}")
    public ResponseEntity<ReadableWeather> getCurrentWeather(@PathVariable String location) {
        ReadableWeather currentWeather = weatherService.getCurrentWeather(location);
        return ResponseEntity.ok(currentWeather);
    }

    /**
     * Retrieves a 5-day weather forecast for a specified location.
     *
     * @param location the location to get the forecast for
     * @return a String containing the 5-day forecast data
     */
    @GetMapping(value = "/forecast/{location}",produces = "application/json")
    public ResponseEntity<String> get5DayForecast(@PathVariable String location) {
        String forecast = weatherService.get5DayForecast(location);
        return ResponseEntity.ok(forecast);
    }

}
