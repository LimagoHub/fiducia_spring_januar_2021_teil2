package de.limago.springdemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.client.CalcClient;

/**
 * Hello world!
 *
 */
public class App {
	// private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		context.registerShutdownHook();

		

//		CalcClient client = (CalcClient) context.getBean("client");
//
//		client.go();

		

	}
}
