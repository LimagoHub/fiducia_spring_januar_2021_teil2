package de.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.demo.Demo;
import de.demo.DemoImpl;
import de.limago.springdemo.HelloWorld;
import de.limago.springdemo.StringHelper;

@Configuration
public class DemoConfig {

	
	
	@Bean(initMethod = "foo")
	public Demo demo() {
		return new DemoImpl();
	}
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public HelloWorld hello(@Value("Hallo Alle")String message,@Qualifier("toUpper") StringHelper stringHelper) {
		HelloWorld hw = new HelloWorld(stringHelper);
		hw.setMessage(message);
		return hw;
	}
	
}
