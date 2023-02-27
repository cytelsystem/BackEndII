package com.dh.ServidorCentralizadoCliente.controlador;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Value("${message}")
    private String message;

    @GetMapping("/message")
    public ResponseEntity<String> getMessages() {
        return ResponseEntity.ok(message);
    }
}
