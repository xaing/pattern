package com.huntkey.test.patterns.flyweight.complex;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by lulx on 2017/10/11 0011 下午 4:59
 * 具体享元角色类
 */
public class CustomerStringImpl implements ICustomerString {

    /**
     * 为内部状态提供存储空间
     */
    private Character mInnerState = null;

    public CustomerStringImpl(Character mInnerState) {
        this.mInnerState = mInnerState;
    }

    public void opt(String state) {
        System.out.println("Inner state : " + mInnerState);
        System.out.println("Outter state :" + state);
    }
}
