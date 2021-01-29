package de.limago.springdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	
	
	@Before(value = "execution(* de.limago.springdemo.Calculator.*(..))")
	public void logBeforeAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName() + " wurde gerufen.");
	}
	
	@Around(value = "execution(* de.limago.springdemo.Calculator.*(..))")
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
 