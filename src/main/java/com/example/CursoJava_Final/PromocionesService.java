package com.example.CursoJava_Final;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CursoJava_Final.model.Promociones;
import com.example.CursoJava_Final.repository.PromocionesRepository;

@Service
public class PromocionesService {

    @Autowired
    private PromocionesRepository promocionesRepository;

    public List<Promociones> getAllPromociones() {
        return promocionesRepository.findAll();
    }

    public Promociones savePromociones(Promociones promociones) {
        return promocionesRepository.save(promociones);
    }

    public Promociones getPromocionesById(Long id) {
        return promocionesRepository.findById(id).orElse(null);
    }

    public void deletePromociones(Long id) {
        promocionesRepository.deleteById(id);
    }

    public Promociones updatePromociones(Long id, Promociones promociones) {
        Promociones existingPromociones = promocionesRepository.findById(id).orElse(null);
        if (existingPromociones != null) {
            existingPromociones.setName(promociones.getName());
            existingPromociones.setDescription(promociones.getDescription());
            existingPromociones.setCode(promociones.getCode());
            existingPromociones.setDiscount(promociones.getDiscount());
            return promocionesRepository.save(existingPromociones);
        }
        return null;
    }
}
