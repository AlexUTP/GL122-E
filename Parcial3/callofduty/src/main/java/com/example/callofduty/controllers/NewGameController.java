package com.example.callofduty.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.callofduty.models.NewGame;
import com.example.callofduty.services.NewGameDB;

@RestController
public class NewGameController{

    @GetMapping("/NewGame/all")
    public List<NewGame> ObtenerNewGame(){
        return new NewGameDB().ObtenerNewGame();
    }
}
