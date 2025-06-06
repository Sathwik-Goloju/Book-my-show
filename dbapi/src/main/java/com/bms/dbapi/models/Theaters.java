package com.bms.dbapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "Theaters")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Theaters {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID Id;
    String address;
    int pinCode;
    String state;
    String name;
    @ManyToOne
    AppUser owner;  //owner = appUser


}
