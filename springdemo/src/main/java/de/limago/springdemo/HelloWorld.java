package de.limago.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Lazy
public class HelloWorld {
	
	@Value("Hallo Universum")
	private String message;
	
	
	
	private final StringHelper stringHelper;
	
	
	//@Autowired
	public HelloWorld(@Qualifier("toUpper") final StringHelper stringHelper) {
		System.out.println("ctor");
		this.stringHelper = stringHelper;
	}

//	public StringHelper getStringHelper() {
//		return stringHelper;
//	}
//
//	public void setStringHelper(StringHelper stringHelper) {
//		this.stringHelper = stringHelper;
//	}

	

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("your message : " + message);
	}

	@PostConstruct
	public void init() {
		System.out.println(stringHelper.process("init " + message));
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy: und tschüss");
	}

}