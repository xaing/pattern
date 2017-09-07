package com.huntkey.test.patterns.observer.timer;

/**
 * Created by lulx on 2017/9/7 0007 下午 2:27
 */
public class TimerTest {
    public static void main(String[] args) {
        NagaTimer nagaTimer = new NagaTimer();
        CountDownTimer countDownTimer = new CountDownTimer("a",5);
        CountDownTimer countDownTimerB = new CountDownTimer("B",10);
        CountDownTimer countDownTimerC = new CountDownTimer("C",15);
        nagaTimer.registerObserver(countDownTimer);
        nagaTimer.registerObserver(countDownTimerB);
        nagaTimer.registerObserver(countDownTimerC);
        nagaTimer.setMeasurements(5);
        nagaTimer.setMeasurements(10);
        nagaTimer.setMeasurements(15);
    }
}
