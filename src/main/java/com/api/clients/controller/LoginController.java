package com.api.clients.controller;

import java.util.List;

import com.api.clients.models.LoginModel;
import com.api.clients.repository.LoginRepository;

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
public class LoginController {
    
    @Autowired
    private LoginRepository actions;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public @ResponseBody List<LoginModel> list(){
        return this.actions.findAll();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody LoginModel save(@RequestBody LoginModel login){
        return this.actions.save(login);
    }

    @RequestMapping(value = "/login/{idLogin}", method = RequestMethod.GET)
    public @ResponseBody LoginModel find(@PathVariable Integer idLogin){
        return this.actions.findByIdLogin(idLogin);
    }

    @RequestMapping(value = "/login/{idLogin}", method = RequestMethod.DELETE)
    public @ResponseBody List<LoginModel> delete(@RequestBody Integer idLogin){
        LoginModel login = find(idLogin);
        this.actions.delete(login);
        return this.actions.findAll();
    }



}
