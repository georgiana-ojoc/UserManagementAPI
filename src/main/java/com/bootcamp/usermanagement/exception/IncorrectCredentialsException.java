package com.bootcamp.usermanagement.exception;

public class IncorrectCredentialsException extends Exception {
    public IncorrectCredentialsException() {
        super("The email or password is incorrect.");
    }
}
