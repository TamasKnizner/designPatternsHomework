package com.epam.hujj.tamasknizner.designpatternshomework.product.food;

public class HotDog extends FoodWithHappiness implements Food {

    private String name;

    public HotDog() {
        this.name = "hotdog";
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
