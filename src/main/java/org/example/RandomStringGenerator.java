package org.example;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGenerator<T> {
	private T seed;

	public String generate(T seed) {

		int length = seed.hashCode()/10000000;
		System.out.println("String length should be: " + length);
		boolean useLetters = true;
		boolean useNumbers = false;

		return RandomStringUtils.random(length >= 0 ? length : -length, useLetters, useNumbers);

	}
}
