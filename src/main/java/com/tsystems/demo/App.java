package com.tsystems.demo;

/**
 * Hello world!
 *
 */
public class App {
    public String sayHi(String message) {
        System.out.println( "Hello " + message);
        return "Hello " + message;
    }

    public static void main( String[] args ) {
        App app = new App();
        app.sayHi("Maven");
    }
}
