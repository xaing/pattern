package com.huntkey.test.patterns.decorator.toggery;

/**
 * Created by lulx on 2017/9/8 0008 下午 4:08
 */
public class Shirt extends ClothingDecorator {

    Person person;

    public Shirt(Person person) {
        this.person = person;
    }

    public String getDescription() {
        return person.getDescription() + "a shirt  ";
    }

    public double cost() {
        return 100 + person.cost();
    }
}
