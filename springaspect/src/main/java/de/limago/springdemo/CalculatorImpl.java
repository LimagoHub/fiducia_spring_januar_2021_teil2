package de.limago.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
	
	
	@Override
	public double add(double a, double b) {
		return a + b;
	}

	@Override
	public double sub(double a, double b) {
		return a - b;
	}

}
