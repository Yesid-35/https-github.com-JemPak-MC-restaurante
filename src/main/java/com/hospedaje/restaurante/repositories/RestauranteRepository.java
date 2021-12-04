package com.hospedaje.restaurante.repositories;

import com.hospedaje.restaurante.models.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RestauranteRepository extends MongoRepository<Restaurante, String> {
    List<Restaurante> findByTipoCena (String tipoCena);
}
