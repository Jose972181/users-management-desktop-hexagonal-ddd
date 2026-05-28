package com.jcaa.usersmanagement.domain.movie.model;

public class Movie {
    private Long id;
    private String title;
    private String genre;
    private Integer durationMinutes;
    private String ageClassification;

    public Movie() {}

    public Movie(Long id, String title, String genre, Integer durationMinutes, String ageClassification) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.durationMinutes = durationMinutes;
        this.ageClassification = ageClassification;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public Integer getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(Integer durationMinutes) { this.durationMinutes = durationMinutes; }
    public String getAgeClassification() { return ageClassification; }
    public void setAgeClassification(String ageClassification) { this.ageClassification = ageClassification; }
}

