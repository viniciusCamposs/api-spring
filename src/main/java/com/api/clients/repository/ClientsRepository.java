package com.api.clients.repository;

import java.util.List;

import com.api.clients.models.ClientsModel;

import org.springframework.data.repository.CrudRepository;

public interface ClientsRepository extends CrudRepository<ClientsModel, Integer>{
    
    // Listar todos os clientes
    List<ClientsModel> findAll();

    // Pesquisar por id
    ClientsModel findByIdClient(int id);

    // Remover cliente
    void delete(ClientsModel client); 

    // Cadastrar/Alterar cliente
    <CliMod extends ClientsModel> CliMod save(CliMod client);


}
