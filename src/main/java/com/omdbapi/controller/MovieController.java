package com.omdbapi.controller;

import com.omdbapi.model.MovieList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

import com.omdbapi.service.MovieService;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    /**
     * This method is responsible for directing the
     * request from the view and then returning the
     * response.
     *
     * @return index.jsp
     */
    @RequestMapping("/")
    public ModelAndView homePage() {
        return new ModelAndView("index");
    }

    /**
     * This method is responsible for directing the
     * request from the view and then returning the
     * response.
     *
     * @param model
     * @return movie.jsp
     */
    @RequestMapping("/movie")
    public ModelAndView getMovie(Model model) {
        MovieList movieList = movieService.findAllMovies();

        model.addAttribute("movieList", movieList);

        return new ModelAndView("movie");
    }
}
