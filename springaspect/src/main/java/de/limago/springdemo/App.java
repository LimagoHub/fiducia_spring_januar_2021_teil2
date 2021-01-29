package de.limago.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = "de")
@EnableAspectJAutoProxy
public class App 
{
	//private static final Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
         Calculator calculator = (Calculator) context.getBean("calculatorImpl");
         System.out.println(calculator.add(3, 4));
         System.out.println(calculator.sub(3, 4));
         context.close();
         
    }
}
