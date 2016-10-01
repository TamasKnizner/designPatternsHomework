package com.epam.hujj.tamasknizner.designpatternshomework.client;

import com.epam.hujj.tamasknizner.designpatternshomework.product.Product;

public interface Client {

	void consume(Product product);

	double getHappiness();

	void setHappiness(double happiness);

	String getName();

}
