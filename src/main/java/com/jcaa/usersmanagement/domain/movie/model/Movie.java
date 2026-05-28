package com.jcaa.usersmanagement.domain.movie.model;

import java.time.LocalDate;
import com.jcaa.usersmanagement.domain.movie.exception.InvalidMovieException;

public class Movie {

    private Long movieId;
    private String title;
    private String originalTitle;
    private String genre;
    private String language;
    private Integer durationMinutes;
    private String ageRating;
    private LocalDate releaseDate;
    private String summary;

    public Movie() {
    }

    public Movie(Long movieId,
                 String title,
                 String originalTitle,
                 String genre,
                 String language,
                 Integer durationMinutes,
                 String ageRating,
                 LocalDate releaseDate,
                 String summary) {

        this.movieId = movieId;
        this.title = title;
        this.originalTitle = originalTitle;
        this.genre = genre;
        this.language = language;
        this.durationMinutes = durationMinutes;
        this.ageRating = ageRating;
        this.releaseDate = releaseDate;
        this.summary = summary;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        if (title == null || title.isBlank()) {
            throw new InvalidMovieException("Movie title cannot be empty");
        }

        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {

        if (durationMinutes <= 0) {
            throw new InvalidMovieException("Movie duration must be greater than zero");
        }

        this.durationMinutes = durationMinutes;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}