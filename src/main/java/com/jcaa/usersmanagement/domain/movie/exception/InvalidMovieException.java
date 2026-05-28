package com.jcaa.usersmanagement.domain.movie.exception;

public class InvalidMovieException extends RuntimeException {

    public InvalidMovieException(String message) {
        super(message);
    }
}