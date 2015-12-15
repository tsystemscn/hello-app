package com.tsystems.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public String sayHi(String message) {
        LOG.info( "sayHi -> Hello " + message);
        return "Hello " + message;
    }

    public static void main( String[] args ) {
        App app = new App();
        app.sayHi("Maven");
    }
}
