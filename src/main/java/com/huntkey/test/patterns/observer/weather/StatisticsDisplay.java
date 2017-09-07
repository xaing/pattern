package com.huntkey.test.patterns.observer.weather;

/**
 * Created by lulx on 2017/9/7 0007 下午 2:09
 */
public class StatisticsDisplay implements Observer,DisplayElement {

    private float temperature; // 温度
    private float humidity; // 湿度
    private Subject weatherData = null;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Statistics: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
