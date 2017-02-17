package com.sample.app;

import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String foo = null;
        System.out.println(foo.length());
        System.out.println("Hello World!");
    }

    String generateSecretToken() {
        Random r = new Random();
        return Long.toHexString(r.nextLong());
    }
}
