package com.bms.dbapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    Double duration;  // in hrs
    Boolean isReleased;
    @ManyToOne
    AppUser movieOwner;
    int review;
    int totalRatingsVotes;
    String language;

}
