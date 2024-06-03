package com.jpa.service;

import com.jpa.entities.AsociacionDeFutbol;
import com.jpa.repositories.AsociacionDeFutbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsociacionDeFutbolService {

    @Autowired
    private AsociacionDeFutbolRepository asociacionDeFutbolRepository;

    public List<AsociacionDeFutbol> getAll(){
        return asociacionDeFutbolRepository.findAll();
    }
    public AsociacionDeFutbol getById(Long id){
        return asociacionDeFutbolRepository.findById(id).orElse(null);
    }
    public AsociacionDeFutbol save(AsociacionDeFutbol asociacionDeFutbol){
        return asociacionDeFutbolRepository.save(asociacionDeFutbol);
    }
    public void delete(Long id){
        asociacionDeFutbolRepository.deleteById(id);
    }
}
