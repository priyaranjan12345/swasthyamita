package com.app.swasthyamita.exception;

public class EmptyInputException extends RuntimeException {
    private String errorCode;
    private String errorMsg;

    public EmptyInputException() {

    }

    public EmptyInputException(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public EmptyInputException(String message, String errorCode, String errorMsg) {
        super(message);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public EmptyInputException(String message, Throwable cause, String errorCode, String errorMsg) {
        super(message, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public EmptyInputException(Throwable cause, String errorCode, String errorMsg) {
        super(cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public EmptyInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode, String errorMsg) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
