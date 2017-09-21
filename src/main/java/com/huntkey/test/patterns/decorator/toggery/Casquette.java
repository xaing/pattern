package com.huntkey.test.patterns.decorator.toggery;

/**
 * Created by lulx on 2017/9/8 0008 下午 4:09
 */
public class Casquette extends HatDecorator {

    Person person;

    public Casquette(Person person) {
        this.person = person;
    }

    public String getDescription() {
        return person.getDescription() + "a casquette  ";
    }

    public double cost() {
        return 75 + person.cost();
    }
}
