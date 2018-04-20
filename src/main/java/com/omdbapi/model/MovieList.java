package com.omdbapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * This object is used to map the JSON object.
 * It is then used to display the data on the
 * front end of the application.
 */
public class MovieList {

    @JsonProperty("Search")
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

}
