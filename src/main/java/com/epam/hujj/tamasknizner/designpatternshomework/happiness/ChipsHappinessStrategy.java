package com.epam.hujj.tamasknizner.designpatternshomework.happiness;

public class ChipsHappinessStrategy implements HappinessStrategy {

    private static final double CHIPS_MODIFIER = 0.05;

    @Override
    public double evaluateStrategy(double happiness) {
        return happiness * CHIPS_MODIFIER;
    }

}
