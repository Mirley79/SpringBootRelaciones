package com.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AsociacionDeFutbol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String pais;
    private String presidente;

    @OneToMany(targetEntity = Club.class, fetch = FetchType.LAZY, mappedBy = "asociacionDeFutbol")
    private List<Club> clubs;
}
