package com.epam.hujj.tamasknizner.designpatternshomework.robot;

import java.util.LinkedList;

import com.epam.hujj.tamasknizner.designpatternshomework.product.Product;

public class Robot {

	private LinkedList<Product> orders;

	public Robot() {
		this.orders = new LinkedList<>();
	}

	public void takeOrder(Product product) {
		orders.add(product);
	}

	public Product serve() {
		return orders.removeFirst();
	}

}
