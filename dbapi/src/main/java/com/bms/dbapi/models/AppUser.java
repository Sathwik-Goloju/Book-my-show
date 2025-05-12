package com.bms.dbapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID Id;  //Base64 -> get generated on based current time
    String name;
    @Column(unique = true)
    String email;
    String password;
    @Column(unique = true)
    String phoneNumber;
    int pincode;
    String address;
    String userType;

}
