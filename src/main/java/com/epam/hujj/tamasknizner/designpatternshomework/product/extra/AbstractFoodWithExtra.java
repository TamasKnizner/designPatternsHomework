package com.epam.hujj.tamasknizner.designpatternshomework.product.extra;

import com.epam.hujj.tamasknizner.designpatternshomework.product.ProductWithHappiness;
import com.epam.hujj.tamasknizner.designpatternshomework.product.food.Food;

public abstract class AbstractFoodWithExtra extends ProductWithHappiness implements FoodWithExtra {

    protected Food food;

    public void setFood(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

}
