package com.hospedaje.restaurante.models;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    @Id
    private String id;
    private List<String> platosConsumidos = new ArrayList<>();
    private String tipoCena;
    private String personas;
    private Double precio;

    public Restaurante(String id, List<String> platosConsumidos, String tipoCena, String personas, Double precio) {
        this.id = id;
        this.platosConsumidos = platosConsumidos;
        this.tipoCena = tipoCena;
        this.personas = personas;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getPlatosConsumidos() {
        return platosConsumidos;
    }

    public void setPlatosConsumidos(List<String> platosConsumidos) {
        this.platosConsumidos = platosConsumidos;
    }

    public String getTipoCena() {
        return tipoCena;
    }

    public void setTipoCena(String tipoCena) {
        this.tipoCena = tipoCena;
    }

    public String getPersonas() {
        return personas;
    }

    public void setPersonas(String personas) {
        this.personas = personas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
