package com.api.clients.controller;

import java.util.List;

import com.api.clients.models.ClientsModel;
import com.api.clients.repository.ClientsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ClientsController {

    // Actions
    @Autowired
    private ClientsRepository actions;

    // List all clients
    @RequestMapping(value="/clients", method = RequestMethod.GET)
    public @ResponseBody List<ClientsModel> list(){
        return actions.findAll();
    }

    // Save client
    @RequestMapping(value="/clients", method = RequestMethod.POST)
    public @ResponseBody ClientsModel save(@RequestBody ClientsModel client){
        return actions.save(client);
    }

    // Find a client
    @RequestMapping(value="/clients/{idClient}", method = RequestMethod.GET)
    public @ResponseBody ClientsModel find(@PathVariable Integer idClient){
        return actions.findByIdClient(idClient);
    }

    // Change client
    @RequestMapping(value="/clients", method = RequestMethod.PUT)
    public @ResponseBody ClientsModel change(@RequestBody ClientsModel client){
        return actions.save(client);
    }

    // Delete Client
    @RequestMapping(value="/clients/{idClient}", method = RequestMethod.DELETE)
    public @ResponseBody List<ClientsModel> delete(@PathVariable Integer idClient){
        ClientsModel client = find(idClient);
        this.actions.delete(client);
        return this.actions.findAll();
    }

    
}
