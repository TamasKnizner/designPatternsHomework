package com.epam.hujj.tamasknizner.designpatternshomework.robot;

import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.tamasknizner.designpatternshomework.client.Client;
import com.epam.hujj.tamasknizner.designpatternshomework.order.Order;
import com.epam.hujj.tamasknizner.designpatternshomework.product.food.Food;

public class Robot {

    private static final Logger LOGGER = LoggerFactory.getLogger(Robot.class);

    private LinkedList<Order> orders;

    public Robot() {
        this.orders = new LinkedList<>();
        LOGGER.info("Robot initialized");
    }

    public void takeOrder(Food food, Client client) {
        LOGGER.info("New order in queue: {} for {}.", food.getName(), client.getName());
        orders.add(new Order(food, client));
    }

    public void serve() {
        Order foodToServe = orders.removeFirst();
        LOGGER.info("Serving product: {}.", foodToServe);
        foodToServe.getClient().consume(foodToServe.getFood());
    }

}
