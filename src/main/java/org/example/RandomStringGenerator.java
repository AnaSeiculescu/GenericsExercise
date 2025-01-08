package org.example;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGenerator<T> {
	private T seed;

	public String generate(T seed) {

		int length;

		if (seed != null ) {
			length = seed.hashCode()/10000000;
		} else {
			length = 0;
		}

		System.out.println("String length should be: " + length);
		System.out.println("Seed is: " + seed);
		boolean useLetters = true;
		boolean useNumbers = false;

		return RandomStringUtils.random(length >= 0 ? length : -length, useLetters, useNumbers);

	}
}
