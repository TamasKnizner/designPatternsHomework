package com.epam.hujj.tamasknizner.designpatternshomework.happiness;

public class KetchupHappinessStrategy implements HappinessStrategy {

    private static final double KETCHUP_MODIFIER = 1.0;

    @Override
    public double evaluateStrategy(double happiness) {
        return happiness * KETCHUP_MODIFIER;
    }

}
