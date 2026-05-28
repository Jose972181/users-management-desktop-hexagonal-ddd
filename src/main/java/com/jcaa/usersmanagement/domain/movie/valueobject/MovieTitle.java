package com.jcaa.usersmanagement.domain.movie.valueobject;

import com.jcaa.usersmanagement.domain.movie.exception.InvalidMovieException;

public class MovieTitle {

    private final String value;

    public MovieTitle(String value) {
        if (value == null || value.isBlank()) {
            throw new InvalidMovieException("Movie title cannot be empty");
        }
        if (value.length() > 100) {
            throw new InvalidMovieException("Movie title cannot exceed 100 characters");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
