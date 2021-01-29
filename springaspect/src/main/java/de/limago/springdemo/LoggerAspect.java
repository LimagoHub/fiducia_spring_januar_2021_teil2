package de.limago.springdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspect {
	
	
	@Before(value = "execution(* de.limago.springdemo.Calculator.*(..))")
	public void logBeforeAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName() + " wurde gerufen.");
	}
}
 