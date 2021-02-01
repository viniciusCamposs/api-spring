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
@Table(name="login")
public class LoginModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idLogin")
    @Getter private int idLogin;

    @Column(name="email")
    @Getter @Setter private String email;

    @Column(name="password")
    @Getter @Setter private String password;
}
