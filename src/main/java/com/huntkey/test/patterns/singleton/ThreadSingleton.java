package com.huntkey.test.patterns.singleton;

/**
 * Created by lulx on 2017/10/10 0010 下午 4:59
 */
public class ThreadSingleton {
    private static ThreadSingleton instance = null;

    private ThreadSingleton() {
    }

    public static synchronized ThreadSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSingleton();
        }
        return instance;
    }
}
