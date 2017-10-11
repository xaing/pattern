package com.huntkey.test.patterns.flyweight.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lulx on 2017/10/11 0011 下午 5:33
 */
public class MultipleCustomerStringImpl implements ICustomerString {

    private Map<Character, ICustomerString> map = new HashMap<Character, ICustomerString>();

    public void add(Character key, ICustomerString value){
        map.put(key, value);
    }

    public void opt(String state) {
        ICustomerString temp;
        for (Character o : map.keySet()){
            temp = map.get(o);
            temp.opt(state);
        }
    }
}
