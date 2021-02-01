package com.api.clients.repository;

import java.util.List;

import com.api.clients.models.LoginModel;

import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<LoginModel, Integer>{
    
    // listar todos login cadastrados
    List<LoginModel> findAll();

    // Pesquisar por id
    LoginModel findByIdLogin(int id);

    // Remover login
    void delete(LoginModel login); 
    
    // Cadastrar/Alterar login
    <LoMod extends LoginModel> LoMod save(LoginModel login);



}
