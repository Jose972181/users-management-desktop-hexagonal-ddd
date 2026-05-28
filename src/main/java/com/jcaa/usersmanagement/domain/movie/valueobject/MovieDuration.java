package com.jcaa.usersmanagement.domain.movie.valueobject;

import com.jcaa.usersmanagement.domain.movie.exception.InvalidMovieException;

public class MovieDuration {

    private final Integer value;

    public MovieDuration(Integer value) {
        if (value == null || value <= 0) {
            throw new InvalidMovieException("Movie duration must be greater than zero");
        }
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
