package com.epam.hujj.tamasknizner.designpatternshomework.order;

import com.epam.hujj.tamasknizner.designpatternshomework.client.Client;
import com.epam.hujj.tamasknizner.designpatternshomework.product.food.Food;

public class Order {

    private Food food;
    private Client client;

    public Order(Food food, Client client) {
        this.food = food;
        this.client = client;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order " + food.getName() + " for " + client.getName();
    }

}
