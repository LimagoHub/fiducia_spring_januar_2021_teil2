package de.model;

import org.springframework.stereotype.Component;

@Component
public class Euro2DollarRechnerImpl implements IEuro2DollarRechner {
	
	
	/* (non-Javadoc)
	 * @see de.model.IEuro2DollarRechner#calculateEuro2Dollar(de.model.Euro2DollarForm)
	 */
	@Override
	public void calculateEuro2Dollar(Euro2DollarForm form) {
		if(form == null) throw new IllegalArgumentException("Form must not be null");
		form.setDollar(form.getEuro() * 1.1 );
	}

}
