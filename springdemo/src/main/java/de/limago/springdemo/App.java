package de.limago.springdemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	//private static final Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
         HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
         obj.getMessage();
         context.close();
         
    }
}
