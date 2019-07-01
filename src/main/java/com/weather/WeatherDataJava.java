package com.weather;

import com.subject.Subject;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherDataJava extends Observable {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherDataJava(){
        observers=new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i =observers.indexOf(o);
        if (i>1){
            observers.remove(o);
        }
    }


    public void measurementsChanged(float temperature,float humidity) {
        setChanged();
       notifyObservers(temperature);
    }

    public void setMesaurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged(temperature,humidity);

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
