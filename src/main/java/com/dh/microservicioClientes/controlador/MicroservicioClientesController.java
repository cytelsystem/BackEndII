package com.dh.microservicioClientes.controlador;

import com.dh.microservicioClientes.client.ISubscriptionClient;
import com.dh.microservicioClientes.service.microservicioClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class MicroservicioClientesController {

    @Autowired
    private microservicioClientesService servicedatos;
    @Autowired
    private ISubscriptionClient subscriptionClient;

    @GetMapping
    public String microservicioFunciona() {
        return "Microservicio de proveedores";
    }

    @GetMapping("/datos")
    public String getdatos(@RequestParam String nombre, @RequestParam String apellido) {
        return servicedatos.getNombres(nombre, apellido);
    }
    @GetMapping("/saludar")
    public String getSaludar() {
        return "Hola como estas";
    }

    @GetMapping("proveedores/find")
    public ResponseEntity<String> find() {
        return ResponseEntity.ok(subscriptionClient.find());
    }

}
