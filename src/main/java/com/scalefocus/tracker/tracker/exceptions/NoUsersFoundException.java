package com.scalefocus.tracker.tracker.exceptions;

public class NoUsersFoundException extends RuntimeException{

    public NoUsersFoundException (String message, Throwable throwable) {
        super(message, throwable);
    }
}
