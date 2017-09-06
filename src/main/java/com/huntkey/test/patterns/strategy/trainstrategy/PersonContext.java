package com.huntkey.test.patterns.strategy.trainstrategy;

/**
 * Created by lulx on 2017/9/6 0006 下午 5:24
 */
public class PersonContext {
    private TravelStrategy strategy;

    public TravelStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public PersonContext(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void travel () {
        this.strategy.travelAlgorithm();
    }

    public static void main(String[] args) {
        PersonContext person = new PersonContext(new TrainStrategy());
        person.travel();
        // 改骑自行车
        person.setStrategy(new BicycleStrategy());
        person.travel();
    }
}
