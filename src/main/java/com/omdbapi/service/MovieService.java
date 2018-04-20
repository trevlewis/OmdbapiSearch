package com.omdbapi.service;

import com.omdbapi.model.MovieList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class MovieService {

    private static final String BASE_URL = "http://www.omdbapi.com/";

    private static final String MOVIE_TITLE = "computer";

    @Value("${omdbapi.api.key}")
    private String apiKey;

    /**
     * This method will return a MovieList object
     * with all the movies that were returned
     * in the search.
     *
     * @return MovieList
     */
    public MovieList findAllMovies() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(buildUrl(), MovieList.class);
    }

    private String buildUrl() {
        return BASE_URL + "?apikey=" + apiKey + "&s=" + MOVIE_TITLE;
    }
}
