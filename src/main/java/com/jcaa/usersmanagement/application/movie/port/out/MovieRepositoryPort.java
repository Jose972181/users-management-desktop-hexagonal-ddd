package com.jcaa.usersmanagement.application.movie.port.out;

import com.jcaa.usersmanagement.domain.movie.model.Movie;

public interface MovieRepositoryPort {

    Movie save(Movie movie);
}
