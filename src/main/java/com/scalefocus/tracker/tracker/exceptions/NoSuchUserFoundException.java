package com.scalefocus.tracker.tracker.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NoSuchUserFoundException extends RuntimeException {

    public NoSuchUserFoundException (String message, Throwable throwable) {
        super();
    }
}
