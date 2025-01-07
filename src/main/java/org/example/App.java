package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        RandomStringGenerator<Student> randomStringGenerator = new RandomStringGenerator<>();

        String generated = randomStringGenerator.generate(new Student("Ana", 35));
        System.out.println("Generated string: " + generated);
    }
}
