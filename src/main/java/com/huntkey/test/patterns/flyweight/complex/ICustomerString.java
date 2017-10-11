package com.huntkey.test.patterns.flyweight.complex;

/**
 * Created by lulx on 2017/10/11 0011 下午 4:56
 * 抽象享元模式
 */
public interface ICustomerString {
    /**
     * 外部对象以参数的形式传入
     * @param state 外部状态
     */
    void opt(String state);
}
