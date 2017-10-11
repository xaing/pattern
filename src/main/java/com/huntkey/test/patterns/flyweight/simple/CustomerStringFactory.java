package com.huntkey.test.patterns.flyweight.simple;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lulx on 2017/10/11 0011 下午 5:38
 */
public class CustomerStringFactory {
    //一般而言，享元工厂对象在整个系统中只有一个，因此也可以使用单例模式
    private Map<Character, ICustomerString> map = new HashMap<Character, ICustomerString>();
    //上例的单纯享元模式
    public ICustomerString factory(Character state) {
        ICustomerString cacheTemp = map.get(state);
        if (cacheTemp == null) {
            cacheTemp = new CustomerStringImpl(state);
            map.put(state, cacheTemp);
        }

        return cacheTemp;
    }
    //复合享元模式
    public ICustomerString factory(List<Character> states) {
        MultipleCustomerStringImpl impl = new MultipleCustomerStringImpl();
        for (Character state : states) {
            impl.add(state, this.factory(state));
        }

        return impl;
    }
}
