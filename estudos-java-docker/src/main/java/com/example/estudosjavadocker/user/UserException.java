package com.example.estudosjavadocker.user;

public class UserException extends RuntimeException {
    public UserException(Long id) {
        super("Could not find record " + id);
    }
}
