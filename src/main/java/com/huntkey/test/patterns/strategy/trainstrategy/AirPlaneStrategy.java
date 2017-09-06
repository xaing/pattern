package com.huntkey.test.patterns.strategy.trainstrategy;

/**
 * Created by lulx on 2017/9/6 0006 下午 5:21
 */
public class AirPlaneStrategy implements TravelStrategy {
    public void travelAlgorithm() {
        System.out.println("坐飞机");
    }
}
