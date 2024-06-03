package com.jpa.repositories;

import com.jpa.entities.AsociacionDeFutbol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsociacionDeFutbolRepository  extends JpaRepository<AsociacionDeFutbol, Long> {

    //List<AsociacionDeFutbol> findAsociacionesByNombreContaining(String nombre);


}
