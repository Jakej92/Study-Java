package com.app.exception.member;

public class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}