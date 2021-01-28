package de.limago.springdemo;

public class HelloWorld {
	private String message;
	
	public HelloWorld() {
		System.out.println("ctor");
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}