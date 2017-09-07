package com.huntkey.test.patterns.observer.timer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulx on 2017/9/7 0007 下午 2:22
 */
public class NagaTimer implements TimerSubject {
    private long mCurrentStamp = 0L;

    private static List<TimerObserver> mObservers = null;

    public NagaTimer() {
        this.mObservers = new ArrayList<TimerObserver>();
    }

    public void registerObserver(TimerObserver o) {
        mObservers.add(o);
    }

    public void removeObserver(TimerObserver o) {
        if (mObservers == null) {
            return;
        }
        mObservers.remove(o);
    }

    public void notifyObservers() {
        if (mObservers == null || mObservers.size() == 0) {
            return;
        }

        for (int i = 0; i < mObservers.size(); i++) {
            CountDownTimer countDownTimer = (CountDownTimer)mObservers.get(i);
            if (countDownTimer.isDone()) {
                removeObserver(mObservers.get(i));
            } else {
                countDownTimer.update(mCurrentStamp);
            }
        }
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(long currentStamp) {
        mCurrentStamp = currentStamp;
        measurementsChanged();
    }
}
