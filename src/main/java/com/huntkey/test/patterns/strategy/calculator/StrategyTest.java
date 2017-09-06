package com.huntkey.test.patterns.strategy.calculator;

/**
 * Created by lulx on 2017/9/6 0006 下午 5:39
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
