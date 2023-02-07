package com.jokesapp.JokesWebApp.controllers;

import com.jokesapp.JokesWebApp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/", "", "/joke"})
    public String executeController (Model model) {
        model.addAttribute("joke", jokeService.getRandomQuote());
        return "index";
    }
}
