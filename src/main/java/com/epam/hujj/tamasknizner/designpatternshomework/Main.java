package com.epam.hujj.tamasknizner.designpatternshomework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.tamasknizner.designpatternshomework.client.Client;
import com.epam.hujj.tamasknizner.designpatternshomework.client.DefaultClient;
import com.epam.hujj.tamasknizner.designpatternshomework.product.ProductBuilder;
import com.epam.hujj.tamasknizner.designpatternshomework.product.food.Food;
import com.epam.hujj.tamasknizner.designpatternshomework.robot.Robot;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    private Robot robot;
    private ProductBuilder productBuilder;

    public Main() {
        this.robot = new Robot();
        this.productBuilder = new ProductBuilder();
    }

    public void startSimulation() {
        LOGGER.info("MAIN START");
        Client bela = new DefaultClient("Bela");
        Food chips = productBuilder.prepareChips();
        robot.takeOrder(chips, bela);

        Client sanyi = new DefaultClient("Sanyi");
        Food hotdogWithKetchup = productBuilder.prepareHotDogWithKetchup();
        robot.takeOrder(hotdogWithKetchup, sanyi);

        robot.serve();
        robot.serve();

        LOGGER.info("{}'s happiness is {}.", bela.getName(), bela.getHappiness());
        LOGGER.info("{}'s happiness is {}.", sanyi.getName(), sanyi.getHappiness());

        LOGGER.info("MAIN END");
    }

    public static void main(String[] args) {
        new Main().startSimulation();
    }

}
