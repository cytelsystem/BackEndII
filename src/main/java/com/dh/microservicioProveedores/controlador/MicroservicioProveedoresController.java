package com.dh.microservicioProveedores.controlador;

import com.dh.microservicioProveedores.service.microservicioProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class MicroservicioProveedoresController {

    @Value("${idRandom}")
    private String port;

    @Autowired
    private microservicioProveedoresService servicedatos;

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

    @GetMapping("/subscription/find")
    public ResponseEntity<String> find() {
        return ResponseEntity.ok(port);
    }

}
