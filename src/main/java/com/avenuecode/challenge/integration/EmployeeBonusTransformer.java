package com.avenuecode.challenge.integration;

import java.math.BigDecimal;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

import java.util.Random;

public class EmployeeBonusTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {

		BigDecimal bonus = null;

		// TODO Insert the bonus implementation here!
		Random randomGenerator = new Random();

		int randomInt = randomGenerator.nextInt(51);
		int scale1 = randomGenerator.nextInt(10);
		int scale2 = randomGenerator.nextInt(10);
		String percent = ""+randomInt+"."+scale1+""+scale2;
		bonus = new BigDecimal(percent);
		return bonus;
	}

}
