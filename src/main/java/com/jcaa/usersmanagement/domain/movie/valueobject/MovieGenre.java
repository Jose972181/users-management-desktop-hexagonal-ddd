package com.jcaa.usersmanagement.domain.movie.valueobject;

import com.jcaa.usersmanagement.domain.movie.exception.InvalidMovieException;
import java.util.Arrays;
import java.util.List;

public class MovieGenre {

    private final String value;

    private static final List<String> ALLOWED_GENRES = Arrays.asList(
            "Action", "Drama", "Comedy", "Horror", "Thriller", "Romance", "Sci-Fi", "Documentary"
    );

    public MovieGenre(String value) {
        if (value == null || !ALLOWED_GENRES.contains(value)) {
            throw new InvalidMovieException("Invalid movie genre: " + value);
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}