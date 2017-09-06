package com.huntkey.test.patterns.strategy.calculator;

/**
 * Created by lulx on 2017/9/6 0006 下午 5:38
 */
public class Plus extends AbstractCalculator implements ICalculator {
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
