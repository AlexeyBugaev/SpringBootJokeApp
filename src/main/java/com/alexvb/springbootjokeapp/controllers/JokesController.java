package com.alexvb.springbootjokeapp.controllers;

import com.alexvb.springbootjokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping(value = "/")
    public String makeJoke(Model model){
        model.addAttribute("joke", jokeService.Joke());
        return "chucknorris";
    }
}
