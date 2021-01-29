package de.limago.springdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@Configuration
@EnableAspectJAutoProxy
public class App 
{
	//private static final Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
         Calculator calculator = (Calculator) context.getBean("calculator");
         System.out.println(calculator.add(3, 4));
         System.out.println(calculator.sub(3, 4));
         context.close();
         
    }
}
