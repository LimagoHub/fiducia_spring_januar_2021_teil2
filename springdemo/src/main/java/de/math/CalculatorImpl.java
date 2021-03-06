package de.math;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("calculator")
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
