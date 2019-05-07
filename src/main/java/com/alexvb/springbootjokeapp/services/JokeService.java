package com.alexvb.springbootjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService extends ChuckNorrisQuotes{

    public String Joke(){
        return getRandomQuote();
    }
}
