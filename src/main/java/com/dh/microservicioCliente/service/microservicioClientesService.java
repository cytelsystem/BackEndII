package com.dh.microservicioCliente.service;

import org.springframework.stereotype.Service;

@Service
public class microservicioClientesService {

    private String nombreApellido;
    public String getNombres(String nombre, String apellido) {

        return "Hola Como estas :" + nombre + " " + apellido;
    }
}
