package com.huntkey.test.patterns.observer.weather;

/**
 * Created by lulx on 2017/9/7 0007 下午 2:13
 */
public class WeatherTest {
    public static void main(String[] args) {
        WeatherData weather = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weather);
        weather.setMeasurements(1,2,12);
        weather.setMeasurements(11,22,1122);
        weather.setMeasurements(111,222,111222);
    }
}
