package com.huntkey.test.patterns.observer.weather;

/**
 * Created by lulx on 2017/9/7 0007 下午 1:58
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
