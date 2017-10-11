package com.huntkey.test.patterns.flyweight.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulx on 2017/10/11 0011 下午 5:12
 * 客户端
 */
public class Test {
    public static void main(String[] args) {
        List<Character> states = new ArrayList<Character>();
        states.add('Y');
        states.add('A');
        states.add('N');
        states.add('B');
        states.add('O');

        states.add('Y');
        states.add('B');

        CustomerStringFactory factory = new CustomerStringFactory();
        ICustomerString customerString1 = factory.factory(states);
        ICustomerString customerString2 = factory.factory(states);

        customerString1.opt("Mutex object test!");
    }
}
