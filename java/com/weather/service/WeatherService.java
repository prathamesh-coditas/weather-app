package com.weather.service;

import com.weather.exception.WeatherException;
import com.weather.model.currentweather.CurrentWeather;
import com.weather.model.currentweather.ReadableWeather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Service class for retrieving weather information.
 * This class provides methods to fetch current weather and 5-day forecast data for a given location.
 */
@Service
public class WeatherService {

    /**
     * API key for accessing the weather service.
     */
    @Value("${weather.api.key}")
    private String apiKey;

    /**
     * URL template for current weather API.
     */
    @Value("${weather.api.url.current}")
    private String currentWeatherUrl;

    /**
     * URL template for forecast API.
     */
    @Value("${weather.api.url.forecast}")
    private String forecastUrl;

    /**
     * RestTemplate for making HTTP requests.
     */
    private final RestTemplate restTemplate;

    /**
     * Constructs a new WeatherService with the given RestTemplate.
     *
     * @param restTemplate the RestTemplate to use for HTTP requests
     */
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Retrieves the current weather for a given location.
     *
     * @param location the location to get weather for
     * @return a ReadableWeather object containing current weather data
     * @throws WeatherException if unable to retrieve weather data
     */
    public ReadableWeather getCurrentWeather(String location) {
        try {
            String url = String.format(currentWeatherUrl, location, apiKey);
            String response = restTemplate.getForObject(url, String.class);
            CurrentWeather currentWeather=CurrentWeather.fromJson(response);
            return currentWeather.toReadableWeather();
        } catch (Exception e) {
            throw new WeatherException("Could not retrieve current weather for: " + location);
        }
    }

    /**
     * Retrieves a 5-day weather forecast for a given location.
     *
     * @param location the location to get the forecast for
     * @return json String containing the 5-day forecast data
     * @throws WeatherException if unable to retrieve forecast data
     */
    public String get5DayForecast(String location) {
        try {
            String url = String.format(forecastUrl, location, apiKey);
            return restTemplate.getForObject(url, String.class);
        } catch (Exception e) {
            throw new WeatherException("Could not retrieve weather forecast for: " + location);
        }
    }
}
