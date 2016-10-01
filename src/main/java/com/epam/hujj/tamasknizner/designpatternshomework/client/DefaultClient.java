package com.epam.hujj.tamasknizner.designpatternshomework.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.tamasknizner.designpatternshomework.product.Product;

public class DefaultClient implements Client {

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultClient.class);

	private double happiness;
	private String name;

	public DefaultClient(double happiness, String name) {
		this.happiness = happiness;
		this.name = name;
	}

	public DefaultClient(String name) {
		this(0, name);
	}

	public void consume(Product product) {
		LOGGER.info("Product {} is consumed, activating effect...", product.getName());

	}

	public double getHappiness() {
		return happiness;
	}

	public void setHappiness(double happiness) {
		this.happiness = happiness;
	}

	public String getName() {
		return name;
	}

}
