package com.epam.hujj.tamasknizner.designpatternshomework.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.tamasknizner.designpatternshomework.product.food.Food;

public class DefaultClient implements Client {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultClient.class);

    private double happiness;
    private String name;

    public DefaultClient(double happiness, String name) {
        this.happiness = happiness;
        this.name = name;
    }

    public DefaultClient(String name) {
        this(100, name);
    }

    public void consume(Food food) {
        LOGGER.info("Food '{}' is consumed, activating effect...", food.getName());
        this.happiness += food.calculateSumHappiness(happiness);
    }

    public double getHappiness() {
        return happiness;
    }

    public String getName() {
        return name;
    }

}
