package com.huntkey.test.patterns.flyweight.complex;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lulx on 2017/10/11 0011 下午 5:08
 * 享元工厂角色类
 *
 */
public class CustomerStringFactory {
    private Map<Character, ICustomerString> map = new HashMap<Character, ICustomerString>();

    public ICustomerString factory(Character state){
        ICustomerString cacheTemp = map.get(state);
        if(cacheTemp == null){
            cacheTemp = new CustomerStringImpl(state);
        }
        return cacheTemp;
    }
}
