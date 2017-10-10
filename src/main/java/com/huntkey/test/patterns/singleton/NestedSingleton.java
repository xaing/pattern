package com.huntkey.test.patterns.singleton;

/**
 * Created by lulx on 2017/10/10 0010 下午 5:14
 */
public class NestedSingleton {
    private static class NestedClass{
        private static NestedClass instance = new NestedClass();
    }

    public static NestedClass getInstance(){
        return NestedClass.instance;
    }

}
