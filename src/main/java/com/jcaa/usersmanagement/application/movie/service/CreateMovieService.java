package com.jcaa.usersmanagement.application.movie.service;

import com.jcaa.usersmanagement.application.movie.dto.CreateMovieRequest;
import com.jcaa.usersmanagement.application.movie.dto.MovieResponse;
import com.jcaa.usersmanagement.application.movie.port.in.CreateMovieUseCase;
import com.jcaa.usersmanagement.application.movie.port.out.MovieRepositoryPort;
import com.jcaa.usersmanagement.domain.movie.model.Movie;
import com.jcaa.usersmanagement.domain.movie.valueobject.MovieDuration;
import com.jcaa.usersmanagement.domain.movie.valueobject.MovieGenre;
import com.jcaa.usersmanagement.domain.movie.valueobject.MovieTitle;

public class CreateMovieService implements CreateMovieUseCase {

    private final MovieRepositoryPort movieRepositoryPort;

    public CreateMovieService(MovieRepositoryPort movieRepositoryPort) {
        this.movieRepositoryPort = movieRepositoryPort;
    }

    @Override
    public MovieResponse createMovie(CreateMovieRequest request) {

        // Validaciones DDD usando Value Objects
        new MovieTitle(request.getTitle());
        new MovieGenre(request.getGenre());
        new MovieDuration(request.getDurationMinutes());

        Movie movie = new Movie();

        movie.setTitle(request.getTitle());
        movie.setOriginalTitle(request.getOriginalTitle());
        movie.setGenre(request.getGenre());
        movie.setLanguage(request.getLanguage());
        movie.setDurationMinutes(request.getDurationMinutes());
        movie.setAgeRating(request.getAgeRating());
        movie.setReleaseDate(request.getReleaseDate());
        movie.setSummary(request.getSummary());

        Movie savedMovie = movieRepositoryPort.save(movie);

        return new MovieResponse(
                savedMovie.getMovieId(),
                savedMovie.getTitle(),
                savedMovie.getGenre(),
                savedMovie.getLanguage(),
                savedMovie.getDurationMinutes(),
                savedMovie.getAgeRating(),
                savedMovie.getReleaseDate()
        );
    }
}
