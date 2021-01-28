package de.client;

import de.math.Calculator;


public class CalcClient {

	private static final double KomplizierteFormel1 = 3.0; 
	private static final double KomplizierteFormel2 = 4.0; 

	
	private final Calculator calculator;
	
		public CalcClient(Calculator calculator) {
		this.calculator = calculator;
	}

	
	public void go() {
		
		System.out.println(calculator.add(KomplizierteFormel1, KomplizierteFormel2));

	}




}
