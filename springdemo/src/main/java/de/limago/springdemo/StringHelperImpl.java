package de.limago.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("toUpper")
public class StringHelperImpl implements StringHelper {
	
	@Override
	public String process(String string) {
		return string.toUpperCase();
	}

}
