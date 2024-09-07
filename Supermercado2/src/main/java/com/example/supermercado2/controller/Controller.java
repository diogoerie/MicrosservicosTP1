package com.example.supermercado2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/home")
    public String BoasVindas() {
        return "Bem-vindo ao Supermercado!";
    }
}
