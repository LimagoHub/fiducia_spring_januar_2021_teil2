package de.limago.springdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggerAspect {
	
//	@Pointcut("execution(* de.limago.springdemo.Calculator.*(..))")
//	public void calculatorMethodes(){}
//	
	
	@Before("PointCuts.calculatorMethodes()")
	public void logBeforeAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName() + " wurde gerufen.");
	}
	
	@Around("PointCuts.calculatorMethodes()")
	public Object logBeforeAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(joinPoint.getSignature().getName() + " wurde gerufen.");
		Object result = null;
		try {
			result = joinPoint.proceed();
		} finally {
			System.out.println("ferttisch. Result=" + result);
		}
		return result;
	}

	
}
 