package com.epam.hujj.tamasknizner.designpatternshomework.client;

import com.epam.hujj.tamasknizner.designpatternshomework.product.food.Food;

public interface Client {

    void consume(Food food);

    double getHappiness();

    String getName();

}
