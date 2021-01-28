package com.api.clients.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="clients")
public class ClientsModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    @Getter private int idClient;

    @Column(name="name")
    @Getter @Setter private String name;

    @Column(name="last_name")
    @Getter @Setter private String last_name;

    @Column(name="age")
    @Getter @Setter private int age;

}
