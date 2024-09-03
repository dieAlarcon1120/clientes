
package com.project.controllers;

import com.project.repositories.ClientRepository;
import com.project.models.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/clients")
public class ClientController {
    
    @Autowired
    private ClientRepository clientRepository;
    
    @GetMapping("/all")
    public List<Client> getAllClients(){
    return clientRepository.findAll();
    }
    
}
