package de.limago.springdemo;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Lazy
public class HelloWorld {
	
	
	private String message;
	
	
	
	private final StringHelper stringHelper;
	
	
	//@Autowired
	public HelloWorld(final StringHelper stringHelper) {
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

	
	public void init() {
		System.out.println(stringHelper.process("init " + message));
	}

	
	public void destroy() {
		System.out.println("destroy: und tschüss");
	}

}