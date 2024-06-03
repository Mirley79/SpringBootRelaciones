package com.jpa.service;

import com.jpa.entities.Tecnico;
import com.jpa.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    public List<Tecnico> getAll(){
        return tecnicoRepository.findAll();
    }

    public Tecnico getById(Long id){
        return tecnicoRepository.findById(id).orElse(null);
    }

    public Tecnico save(Tecnico tecnico){
        return tecnicoRepository.save(tecnico);
    }

    public Tecnico upDate(Tecnico tecnico){
        return tecnicoRepository.save(tecnico);
    }

    public void delete(Long id){
        tecnicoRepository.deleteById(id);
    }
}
