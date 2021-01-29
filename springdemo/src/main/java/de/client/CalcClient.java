package de.client;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import de.math.Calculator;

@Component
public class CalcClient {

	private static final double KomplizierteFormel1 = 3.0; 
	private static final double KomplizierteFormel2 = 4.0; 

	
	private final Calculator calculator;
	
	
	@Autowired
	public CalcClient(@Qualifier("calculatorSecure")Calculator calculator) {
		this.calculator = calculator;
	}

	@PostConstruct
	public void go() {
		
		System.out.println(calculator.add(KomplizierteFormel1, KomplizierteFormel2));

	}




}
