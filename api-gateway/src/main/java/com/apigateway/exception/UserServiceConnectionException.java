package com.apigateway.exception;

public class UserServiceConnectionException extends RemoteClientException {

    public UserServiceConnectionException(String message) {
        super(message);
    }
}
