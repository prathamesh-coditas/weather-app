package com.weather.exception;

/**
 * Custom exception class for weather-related errors in the application.
 * This exception is used to encapsulate and report errors that occur during
 * weather data retrieval or processing.
 */
public class WeatherException extends RuntimeException {

    /**
     * Constructs a new WeatherException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval
     *        by the {@link #getMessage()} method)
     */
    public WeatherException(String message) {
        super(message);
    }
}
