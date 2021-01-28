package de.limago.springdemo;

import org.springframework.context.ApplicationContext;
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
    	 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	 
    	 
    	 System.out.println("xxxx");
    	 
         HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
        
        obj1.getMessage();
         
    }
}
