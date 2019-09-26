package com.manchesterdigital;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * checked exception example
 */

public class ExceptionsExample {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("Z://myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace(); //just logs the stack trace to console. Some businesses may want you to rethrow.
        }

    }
}
