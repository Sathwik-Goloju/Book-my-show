package com.bms.dbapi.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "theaters")
public class Theaters {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID Id;
    String address;
    int pincode;
    String state;
    String name;
    @ManyToOne
    AppUser appUser;  //owner = appUser


}
