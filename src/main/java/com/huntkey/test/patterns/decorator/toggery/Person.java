package com.huntkey.test.patterns.decorator.toggery;

/**
 * Created by lulx on 2017/9/8 0008 下午 3:45
 */
public abstract class Person {
    String description = "Unkonwn";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
