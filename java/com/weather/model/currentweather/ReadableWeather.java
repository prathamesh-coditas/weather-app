package com.weather.model.currentweather;

/**
 * Represents weather information in a human-readable format.
 * This class encapsulates weather data including location, temperature, weather description, and humidity.
 */
public class ReadableWeather {
    private String location;
    private double temperature;
    private String weatherDescription;
    private int humidity;

    /**
     * Constructs a new ReadableWeather object with the specified weather information.
     *
     * @param location           the name or identifier of the location
     * @param temperature        the temperature in Celsius
     * @param weatherDescription a brief description of the weather conditions
     * @param humidity           the humidity percentage
     */
    public ReadableWeather(String location, double temperature, String weatherDescription, int humidity) {
        this.location = location;
        this.temperature = temperature;
        this.weatherDescription = weatherDescription;
        this.humidity = humidity;
    }

    /**
     * Gets the location.
     *
     * @return the location name or identifier
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location.
     *
     * @param location the location name or identifier to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets the temperature.
     *
     * @return the temperature in Celsius
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Sets the temperature.
     *
     * @param temperature the temperature in Celsius to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Gets the weather description.
     *
     * @return a brief description of the weather conditions
     */
    public String getWeatherDescription() {
        return weatherDescription;
    }

    /**
     * Sets the weather description.
     *
     * @param weatherDescription a brief description of the weather conditions to set
     */
    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    /**
     * Gets the humidity.
     *
     * @return the humidity percentage
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * Sets the humidity.
     *
     * @param humidity the humidity percentage to set
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    /**
     * Returns a string representation of the weather information.
     *
     * @return a formatted string containing location, temperature, weather description, and humidity
     */
    @Override
    public String toString() {
        return String.format("Location: %s, Temperature: %.1f°C, Weather: %s, Humidity: %d%%",
                location, temperature, weatherDescription, humidity);
    }
}
