package de.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import de.gui.IEuro2DollarRechnerView;


@ComponentScan(basePackages = "de")
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Main.class);
		annotationConfigApplicationContext.registerShutdownHook();
		
		IEuro2DollarRechnerView view =(IEuro2DollarRechnerView) annotationConfigApplicationContext.getBean("euro2DollarRechnerView");
		view.show();
	}

}
