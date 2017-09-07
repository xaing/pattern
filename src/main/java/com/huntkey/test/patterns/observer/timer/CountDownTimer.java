package com.huntkey.test.patterns.observer.timer;

/**
 * Created by lulx on 2017/9/7 0007 下午 2:24
 */
public class CountDownTimer implements TimerDisplayable,TimerObserver {
    private String mName;
    private long mStartStamp;
    private long mCountdownStamp;
    private long mCurrentStamp = 0L;

    public CountDownTimer(String mName, long mCountdownStamp) {
        this.mStartStamp = System.currentTimeMillis();
        this.mName = mName;
        this.mCountdownStamp = mCountdownStamp;
    }

    public void update(long stamp) {
        mCurrentStamp = stamp;
        display();
    }

    public void display() {
        if (mCurrentStamp - mStartStamp <= mCountdownStamp) {
            System.out.println(getName() + "还剩" + ((mCountdownStamp - (mCurrentStamp - mStartStamp)) / 1000) + "s");
        }
    }

    public boolean isDone() {
        if (mCurrentStamp - mStartStamp >= mCountdownStamp) {
            return true;
        }

        return false;
    }

    public String getName() {
        return mName;
    }
}
