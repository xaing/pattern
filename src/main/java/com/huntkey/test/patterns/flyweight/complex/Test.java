package com.huntkey.test.patterns.flyweight.complex;

/**
 * Created by lulx on 2017/10/11 0011 下午 5:12
 * 客户端
 */
public class Test {
    public static void main(String[] args) {
        CustomerStringFactory factory = new CustomerStringFactory();
        ICustomerString customerString = factory.factory(new Character('B'));
        customerString.opt("BAT");

        customerString = factory.factory(new Character('A'));
        customerString.opt("Ali");
    }
}
