package com.huntkey.test.patterns.singleton;

/**
 * Created by lulx on 2017/10/10 0010 下午 4:12
 * 在类加载的时候初始化这个单独的实例
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
    }
}
