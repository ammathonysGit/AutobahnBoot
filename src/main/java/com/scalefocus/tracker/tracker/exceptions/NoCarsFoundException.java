package com.scalefocus.tracker.tracker.exceptions;

public class NoCarsFoundException extends RuntimeException {

    public NoCarsFoundException(String errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }
}
