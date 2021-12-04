package com.hospedaje.restaurante.controllers;

import com.hospedaje.restaurante.exceptions.OrderNotFoundException;
import com.hospedaje.restaurante.models.Restaurante;
import com.hospedaje.restaurante.repositories.RestauranteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestauranteCrontroller {

    private final RestauranteRepository restauranteRepository;

    public RestauranteCrontroller(RestauranteRepository restauranteRepository){
        this.restauranteRepository = restauranteRepository;
    }

    @PostMapping("/reservas")
    String craerReserva(@RequestBody Restaurante restaurante){
        restauranteRepository.save(restaurante);
        return "Creación Exitosa !";
    }

    @GetMapping("/reservas/{id}")
    Restaurante getReservas(@PathVariable String id){
        return restauranteRepository.findById(id).orElseThrow(
                () -> new OrderNotFoundException("No se encontro la Reserva con la Id: " + id)
        );
    }

    @GetMapping("/reserva")
    List<Restaurante> getAllReservas(){
        return restauranteRepository.findAll();
    }

    @GetMapping("/findByType/{type}")
    List<Restaurante> filterByType(@PathVariable String type){
        return restauranteRepository.findByTipoCena(type);
    }

    @DeleteMapping("/reserva/{id}")
    String deleteReserva(@PathVariable String id){
        restauranteRepository.deleteById(id);
        return "Borrado Exitoso !";
    }

}
