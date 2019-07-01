package com.WeatherStationTest;

import com.display.CurrentConditionsDisplay;
import com.display.ForecastDisplay;
import com.display.HeatIndexDisplay;
import com.weather.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay=new HeatIndexDisplay(weatherData);
        weatherData.setMesaurements(12,12,23);
        weatherData.setMesaurements(13,24,23);
    }
}
