package com.example.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductosController {
    
    @GetMapping("/hola")
    public String ObtenerTodosProductos(){
        return "Hola";
    }
}
