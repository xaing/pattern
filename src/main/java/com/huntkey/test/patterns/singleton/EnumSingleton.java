package com.huntkey.test.patterns.singleton;

/**
 * Created by lulx on 2017/10/10 0010 下午 5:22
 */
public enum EnumSingleton {
    INSTANCE;

    public void methodA(){
        System.out.println(" enum singleton !");
    }
}

class EnumSingletonTest{
    public static void main(String[] args) {
        EnumSingleton.INSTANCE.methodA();
    }
}
