package com.epam.hujj.tamasknizner.designpatternshomework.client;

import com.epam.hujj.tamasknizner.designpatternshomework.product.Product;

public interface Client {

    void consume(Product product);

    int getHappiness();

    void setHappiness(int happiness);

    String getName();

}
