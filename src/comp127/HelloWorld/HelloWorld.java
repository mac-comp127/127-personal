package comp127.HelloWorld;

/**
 * File: HelloWorld.java
 * This program prints "hello world"
 */

public class HelloWorld {
    public static int addTwo(int number) {
        return number + 2;
    }

    /**
     * This main method starts running the program
     */
    public static void main(String[] args){
        // print a traditional greeting
        System.out.println("Hello World");

        // print out some diagnostic information
        String javaVersion = System.getProperty("java.version"); // the version of java being used
        System.out.println("You are using java version: '" + javaVersion + "'");

    }
}
