package com.app.core;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private final ObjectProvider<Car> carProvider;

	public Engine(ObjectProvider<Car> carProvider) {
		this.carProvider = carProvider;
	}

	public Car getEngineDetails() {
		System.out.println("Getting ENGINE details impl");
		Car car = carProvider.getObject();
		car.getCarDetails();
		return car;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
