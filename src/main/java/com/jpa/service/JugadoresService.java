package com.jpa.service;

import com.jpa.entities.Jugadores;
import com.jpa.repositories.JugadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadoresService {

    @Autowired
    private JugadoresRepository jugadoresRepository;

    public List<Jugadores> getAll(){
        return jugadoresRepository.findAll();
    }

    public Jugadores getById(Long id){
        return jugadoresRepository.findById(id).orElse(null);
    }

    public Jugadores save(Jugadores jugadores){
        return jugadoresRepository.save(jugadores);
    }

    public void delete(Long id){
        jugadoresRepository.findById(id);
    }
}
