package com.display;

import com.observer.Observer;
import com.subject.Subject;

public class HeatIndexDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }

    public void display() {
        System.out.println("Heat Index conditions : "+ temperature+ "F degress and humidity -  "+humidity);
    }
}
