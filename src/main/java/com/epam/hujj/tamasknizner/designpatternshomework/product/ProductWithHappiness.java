package com.epam.hujj.tamasknizner.designpatternshomework.product;

import com.epam.hujj.tamasknizner.designpatternshomework.happiness.HappinessStrategy;

public abstract class ProductWithHappiness {

    protected HappinessStrategy happinessStrategy;

    public HappinessStrategy getHappinessStrategy() {
        return happinessStrategy;
    }

    public void setHappinessStrategy(HappinessStrategy happinessStrategy) {
        this.happinessStrategy = happinessStrategy;
    }

}
