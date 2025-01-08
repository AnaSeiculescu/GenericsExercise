package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        RandomStringGenerator<Student> randomStringGenerator = new RandomStringGenerator<>();
//        Student student = new Student("Ana", 35);
        Student student = null;
        String generated = randomStringGenerator.generate(student);
        System.out.println("Generated string: " + generated);
    }
}
