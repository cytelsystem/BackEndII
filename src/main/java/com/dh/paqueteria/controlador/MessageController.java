package com.dh.paqueteria.controlador;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private String message = "hola";

    @GetMapping("/message")
    public ResponseEntity<String> getMessage() {

        return ResponseEntity.ok(message);
    }

}