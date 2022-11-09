package com.example.ejemplo.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductosController {

    @GetMapping("/Productos/all")
    public String ObtenerTodosProductos() {
        return "Hola";
    }
}
