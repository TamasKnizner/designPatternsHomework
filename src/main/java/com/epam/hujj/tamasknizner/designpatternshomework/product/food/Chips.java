package com.epam.hujj.tamasknizner.designpatternshomework.product.food;

public class Chips extends FoodWithHappiness implements Food {

    private String name;

    public Chips() {
        this.name = "chips";
    }

    @Override
    public double calculateSumHappiness(double happiness) {
        return happinessStrategy.evaluateStrategy(happiness);
    }

    @Override
    public String getName() {
        return name;
    }

}
