package com.epam.hujj.tamasknizner.designpatternshomework.product.extra;

public class Ketchup extends AbstractFoodWithExtra {

    private String name;

    public Ketchup() {
        this.name = "ketchup";
    }

    @Override
    public double calculateSumHappiness(double happiness) {
        return food.calculateSumHappiness(happiness) * 2;
    }

    @Override
    public String getName() {
        return food.getName() + " with " + name;
    }

}
