package com.example.CursoJava_Final.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/promociones")
public class PromocionesController {

    @GetMapping
    public String getPromociones() {
        return "Promociones";
    }
}
