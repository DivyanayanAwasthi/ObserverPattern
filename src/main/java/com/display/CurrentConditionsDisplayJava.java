package com.display;

import com.weather.WeatherData;
import com.weather.WeatherDataJava;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayJava implements Observer,DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    public CurrentConditionsDisplayJava(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    public void update(Observable observable,Object obj) {
        if(obj instanceof WeatherDataJava){
            WeatherDataJava weatherData =(WeatherDataJava) obj;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
        }
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions : "+ temperature+ "F degress and humidity -  "+humidity);
    }
}
