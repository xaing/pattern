package com.huntkey.test.patterns.singleton;

/**
 * Created by lulx on 2017/10/10 0010 下午 5:08
 */
public class NewThreadSingleton {
    private static NewThreadSingleton instance = null;

    private NewThreadSingleton() {
    }

    public static NewThreadSingleton getInstance(){
        if(instance == null){
            synchronized (NewThreadSingleton.class){
                if (instance == null){
                    NewThreadSingleton t = new NewThreadSingleton();
                    instance = t;
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        NewThreadSingleton instance = NewThreadSingleton.getInstance();
    }
}
