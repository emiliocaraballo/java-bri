/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.brilla.services;
import com.code.brilla.repositories.ClientRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author emilio
 */
@Service
public class ClientService {

    private final ClientRepository clientRepository;
   @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public  String getAll() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json =objectMapper.writeValueAsString(clientRepository.findAll());
            return json;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ClientService.class.getName()).log(Level.SEVERE, null, ex);
        }
        //error
        return null;
    }
}