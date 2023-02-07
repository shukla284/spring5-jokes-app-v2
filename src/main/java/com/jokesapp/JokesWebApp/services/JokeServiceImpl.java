package com.jokesapp.JokesWebApp.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

    @Override
    public String getRandomQuote() {
        return (new ChuckNorrisQuotes()).getRandomQuote();
    }
}
