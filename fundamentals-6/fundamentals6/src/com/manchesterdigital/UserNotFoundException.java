package com.manchesterdigital;

/**
 * how businesses categorise their exceptions.
 */

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
