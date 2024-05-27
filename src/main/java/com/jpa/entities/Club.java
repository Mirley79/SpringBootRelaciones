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
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    //Esta relacion va donde va ir la llave foranea, en este caso en Club
    @OneToOne(targetEntity = Tecnico.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_tecnico")
    private Tecnico tecnico;


    @OneToMany(targetEntity = Jugadores.class, fetch = FetchType.LAZY, mappedBy = "club")
    private List<Jugadores> jugadores;

    @ManyToOne(targetEntity = AsociacionDeFutbol.class)
    private AsociacionDeFutbol asociacionDeFutbol;

    @ManyToMany(targetEntity = CompeticionesDeFutbol.class, fetch = FetchType.LAZY)
    //Permite personalizar la tabla intermedia
    @JoinTable(name = "competicion_club", joinColumns = @JoinColumn(name = "club"), inverseJoinColumns = @JoinColumn(name = "competicion"))
    private List<CompeticionesDeFutbol> competicionesDeFutbol;
}
