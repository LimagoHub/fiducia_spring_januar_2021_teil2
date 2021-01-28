package de.limago.springdemo;

public class StringHelperImpl implements StringHelper {
	
	@Override
	public String process(String string) {
		return string.toUpperCase();
	}

}
