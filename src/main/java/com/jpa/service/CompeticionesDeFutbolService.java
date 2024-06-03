package com.jpa.service;

import com.jpa.entities.CompeticionesDeFutbol;
import com.jpa.repositories.CompeticionesDeFutbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompeticionesDeFutbolService {

    @Autowired
    private CompeticionesDeFutbolRepository competicionesDeFutbolRepository;

    public List<CompeticionesDeFutbol> getAll(){
        return competicionesDeFutbolRepository.findAll();
    }

    public CompeticionesDeFutbol getById(Long id){
        return competicionesDeFutbolRepository.findById(id).orElse(null);
    }

    public CompeticionesDeFutbol save(CompeticionesDeFutbol competicionesDeFutbol){
        return competicionesDeFutbolRepository.save(competicionesDeFutbol);
    }

    public void delete(Long id){
        competicionesDeFutbolRepository.deleteById(id);
    }
}
