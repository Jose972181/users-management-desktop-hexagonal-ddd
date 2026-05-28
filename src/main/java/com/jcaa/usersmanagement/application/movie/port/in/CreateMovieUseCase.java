package com.jcaa.usersmanagement.application.movie.port.in;

import com.jcaa.usersmanagement.application.movie.dto.CreateMovieRequest;
import com.jcaa.usersmanagement.application.movie.dto.MovieResponse;

public interface CreateMovieUseCase {

    /**
     * Crea una nueva película en el sistema
     * @param request DTO de entrada con los datos de la película
     * @return MovieResponse con información creada
     */
    MovieResponse createMovie(CreateMovieRequest request);
}
