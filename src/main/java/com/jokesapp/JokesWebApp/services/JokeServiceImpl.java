package com.jokesapp.JokesWebApp.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

    ChuckNorrisQuotes quoteProxy;

    public JokeServiceImpl() { this.quoteProxy = new ChuckNorrisQuotes(); }

    @Override
    public String getRandomQuote() {
        return quoteProxy.getRandomQuote();
    }
}
