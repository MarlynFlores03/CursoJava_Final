package com.example.CursoJava_Final.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.CursoJava_Final.model.Promociones;
import com.example.CursoJava_Final.PromocionesService;

@RestController
@RequestMapping("/api/promociones")
public class PromocionesController {
    @Autowired
    private PromocionesService promocionesService;

    @GetMapping
    public List<Promociones> getAllProducts() {
        return promocionesService.getAllPromociones();
    }

    @GetMapping("/{id}")
    public Promociones getProductById(@PathVariable Long id) {
        return promocionesService.getPromocionesById(id);
    }

    @PostMapping
    public Promociones saveProduct(@RequestBody Promociones promociones) {
        return promocionesService.savePromociones(promociones);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        promocionesService.deletePromociones(id);
    }
}