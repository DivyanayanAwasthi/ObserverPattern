package com.WeatherStationTest;

import com.display.CurrentConditionsDisplayJava;
import com.display.ForecastDisplay;
import com.display.HeatIndexDisplay;
import com.weather.WeatherDataJava;

public class WeatherStationJava {

    public static void main(String[] args) {
        WeatherDataJava weatherData=new WeatherDataJava();
        CurrentConditionsDisplayJava currentConditionsDisplay=new CurrentConditionsDisplayJava(weatherData);
        weatherData.setMesaurements(11,1,1);
    }
}
