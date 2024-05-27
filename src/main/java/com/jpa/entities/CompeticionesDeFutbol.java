package com.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CompeticionesDeFutbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name = "pago_premio")
    private Integer pagoPremio;
    @Column(name = "fecha_inicio", columnDefinition = "DATE")
    private LocalDate fechaDeInicio;
    @Column(name = "fecha_fin", columnDefinition = "DATE")
    private LocalDate fechaDeFinalizacion;

    //@ManyToMany(targetEntity = Club.class, fetch = FetchType.LAZY)
    //private List<Club> clubs;
}
