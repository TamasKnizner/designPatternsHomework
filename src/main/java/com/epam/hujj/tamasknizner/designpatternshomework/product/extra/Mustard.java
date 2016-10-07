package com.epam.hujj.tamasknizner.designpatternshomework.product.extra;

public class Mustard extends AbstractFoodWithExtra {

    private String name;

    public Mustard() {
        this.name = "mustard";
    }

    @Override
    public double calculateSumHappiness(double happiness) {
        return 1;
    }

    @Override
    public String getName() {
        return food.getName() + " with " + name;
    }

}
