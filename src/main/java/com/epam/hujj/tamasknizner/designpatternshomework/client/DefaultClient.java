package com.epam.hujj.tamasknizner.designpatternshomework.client;

import com.epam.hujj.tamasknizner.designpatternshomework.product.Product;

public class DefaultClient implements Client {

    private int happiness;
    private String name;

    public DefaultClient(int happiness, String name) {
        this.happiness = happiness;
        this.name = name;
    }

    public DefaultClient(String name) {
        this(0, name);
    }

    @Override
    public void consume(Product product) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getHappiness() {
        return happiness;
    }

    @Override
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    @Override
    public String getName() {
        return name;
    }

}
