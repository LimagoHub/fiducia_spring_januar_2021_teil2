package de.limago.springdemo;

public class HelloWorld {
	private String message;
	private final StringHelper stringHelper;

	public HelloWorld(final StringHelper stringHelper) {
		
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
		System.out.println(stringHelper.process("your message : " + message));
	}

	// init
	public void init() {
		System.out.println("init " + message);
	}

	public void destroy() {
		System.out.println("destroy: und tschüss");
	}

}