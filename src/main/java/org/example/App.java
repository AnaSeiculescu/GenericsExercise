package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        RandomStringGenerator<String> randomStringGenerator = new RandomStringGenerator<>();

        String generated = randomStringGenerator.generate("ETWHGFI");
        System.out.println("Generated string: " + generated);
    }
}
