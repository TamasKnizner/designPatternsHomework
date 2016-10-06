package com.epam.hujj.tamasknizner.designpatternshomework.robot;

import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.tamasknizner.designpatternshomework.product.Product;

public class Robot {

	private static final Logger LOGGER = LoggerFactory.getLogger(Robot.class);

	private LinkedList<Product> orders;

	public Robot() {
		this.orders = new LinkedList<>();
		LOGGER.info("Robot initialized");
	}

	public void takeOrder(Product product) {
		LOGGER.info("New order in queue: {}", product.toString());
		orders.add(product);
	}

	public Product serve() {
		Product productToServe = orders.removeFirst();
		LOGGER.info("Serving product: {}", productToServe.toString());
		return productToServe;
	}

}
