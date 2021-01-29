package de.limago.springdemo;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {
	
	@Pointcut("execution(* de.limago.springdemo.Calculator.*(..))")
	public void calculatorMethodes(double a){}
	


	


}
