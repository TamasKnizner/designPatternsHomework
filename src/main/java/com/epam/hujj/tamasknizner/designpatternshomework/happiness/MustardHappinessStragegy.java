package com.epam.hujj.tamasknizner.designpatternshomework.happiness;

public class MustardHappinessStragegy implements HappinessStrategy {

    private static final double MUSTARD_MODIFIER = 1.0;

    @Override
    public double evaluateStrategy(double happiness) {
        return MUSTARD_MODIFIER;
    }

}
