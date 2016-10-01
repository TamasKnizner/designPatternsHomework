package com.epam.hujj.tamasknizner.designpatternshomework.product;

import com.epam.hujj.tamasknizner.designpatternshomework.happiness.HappinessStrategy;
import com.epam.hujj.tamasknizner.designpatternshomework.product.extra.Extra;
import com.epam.hujj.tamasknizner.designpatternshomework.product.food.Food;

public abstract class Product {

	private Food food;
	private Extra extra;
	private String name;
	private HappinessStrategy happinessStrategy;

	private boolean hasExtra() {
		return extra != null;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Extra getExtra() {
		return extra;
	}

	public void setExtra(Extra extra) {
		this.extra = extra;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
