package com.epam.hujj.tamasknizner.designpatternshomework.product;

import com.epam.hujj.tamasknizner.designpatternshomework.happiness.ChipsHappinessStrategy;
import com.epam.hujj.tamasknizner.designpatternshomework.happiness.HotDogHappinessStrategy;
import com.epam.hujj.tamasknizner.designpatternshomework.happiness.KetchupHappinessStrategy;
import com.epam.hujj.tamasknizner.designpatternshomework.happiness.MustardHappinessStragegy;
import com.epam.hujj.tamasknizner.designpatternshomework.product.extra.Ketchup;
import com.epam.hujj.tamasknizner.designpatternshomework.product.extra.Mustard;
import com.epam.hujj.tamasknizner.designpatternshomework.product.food.Chips;
import com.epam.hujj.tamasknizner.designpatternshomework.product.food.Food;
import com.epam.hujj.tamasknizner.designpatternshomework.product.food.HotDog;

public class ProductBuilder {

    public Food prepareChips() {
        Chips chips = new Chips();
        chips.setHappinessStrategy(new ChipsHappinessStrategy());
        return chips;
    }

    public Food prepareHotDog() {
        HotDog hotDog = new HotDog();
        hotDog.setHappinessStrategy(new HotDogHappinessStrategy());
        return hotDog;
    }

    public Food prepareChipsWithKetchup() {
        Ketchup ketchup = new Ketchup();
        ketchup.setFood(prepareChips());
        ketchup.setHappinessStrategy(new KetchupHappinessStrategy());
        return ketchup;
    }

    public Food prepareChipsWithMustard() {
        Mustard mustard = new Mustard();
        mustard.setFood(prepareChips());
        mustard.setHappinessStrategy(new MustardHappinessStragegy());
        return mustard;
    }

    public Food prepareHotDogWithKetchup() {
        Ketchup ketchup = new Ketchup();
        ketchup.setFood(prepareHotDog());
        ketchup.setHappinessStrategy(new KetchupHappinessStrategy());
        return ketchup;
    }

    public Food prepareHotDogWithMustard() {
        Mustard mustard = new Mustard();
        mustard.setFood(prepareHotDog());
        mustard.setHappinessStrategy(new MustardHappinessStragegy());
        return mustard;
    }

}
