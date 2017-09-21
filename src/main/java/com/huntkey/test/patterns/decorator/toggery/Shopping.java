package com.huntkey.test.patterns.decorator.toggery;

/**
 * Created by lulx on 2017/9/8 0008 下午 4:11
 */
public class Shopping {
    public static void main(String[] args) {
        Person person = new Teenager();
        person = new Shirt(person);
        person = new Casquette(person);
        System.out.println(person.getDescription() + " ￥ " +person.cost());
    }
}
