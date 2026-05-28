package com.jcaa.usersmanagement.domain.movie.port;

import com.jcaa.usersmanagement.domain.movie.model.Movie;
import java.util.List;
import java.util.Optional;

public interface MovieRepository {
    Movie save(Movie movie);
    Optional<Movie> findById(Long id);
    List<Movie> findAll();
    Movie update(Movie movie);
    void deleteById(Long id);
}
