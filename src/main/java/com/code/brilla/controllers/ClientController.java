package com.code.brilla.controllers;

import com.code.brilla.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientService clientService;
    
    @GetMapping("/client}")
    public ResponseEntity<String> client() {
        
        return ResponseEntity.ok()
        .header("Content-Type", "application/json")
        .body(clientService.getAll());
    }

    @PostMapping("/mensaje")
    public ResponseEntity<String> enviarMensaje(@RequestBody String mensaje) {
        // Aquí puedes procesar el mensaje y realizar alguna lógica adicional si es necesario
        return new ResponseEntity<>("Mensaje recibido: " + mensaje, HttpStatus.CREATED);
    }
}