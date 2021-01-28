package de.limago.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("toLower")
public class OtherStringHelperImpl implements StringHelper {

	@Override
	public String process(String string) {
		// TODO Auto-generated method stub
		return string.toLowerCase();
	}

}
