package de.limago.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import de.demo.Demo;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages = "de")
public class App {
	// private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		
		
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		
		context.registerShutdownHook();

		

//		CalcClient client = (CalcClient) context.getBean("client");
//App
//		client.go();

		

	}
}
