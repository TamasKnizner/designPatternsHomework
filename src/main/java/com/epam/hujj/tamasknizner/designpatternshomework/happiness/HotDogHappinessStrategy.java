package com.epam.hujj.tamasknizner.designpatternshomework.happiness;

public class HotDogHappinessStrategy implements HappinessStrategy {

    private static final double HOTDOG_MODIFIER = 2.0;

    @Override
    public double evaluateStrategy(double happiness) {
        return HOTDOG_MODIFIER;
    }

}
