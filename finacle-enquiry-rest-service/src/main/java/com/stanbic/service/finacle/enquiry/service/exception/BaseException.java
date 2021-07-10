package com.stanbic.service.finacle.enquiry.service.exception;

public class BaseException extends RuntimeException{

    protected String message;

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }
    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }
    public BaseException(Throwable cause) {
        super(cause);
    }
}
