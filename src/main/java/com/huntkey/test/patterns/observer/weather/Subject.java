package com.huntkey.test.patterns.observer.weather;

/**
 * Created by lulx on 2017/9/7 0007 下午 1:56
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
