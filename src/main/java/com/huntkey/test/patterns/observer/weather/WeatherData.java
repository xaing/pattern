package com.huntkey.test.patterns.observer.weather;

import java.util.ArrayList;

/**
 * Created by lulx on 2017/9/7 0007 下午 2:00
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers = null; // 观察者列表

    private float temperature; // 温度
    private float humidity; // 湿度
    private float pressure; // 气压

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
