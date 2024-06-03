package com.jpa.repositories;

import com.jpa.entities.Jugadores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadoresRepository extends JpaRepository<Jugadores, Long> {
}
