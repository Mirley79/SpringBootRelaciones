package com.jpa.controller;

import com.jpa.entities.AsociacionDeFutbol;
import com.jpa.service.AsociacionDeFutbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relations/asociaciones")
public class AsociacionDeFutbolController {

    @Autowired
    private AsociacionDeFutbolService asociacionDeFutbolService;

    @GetMapping
    public List<AsociacionDeFutbol> getAll(){
        return asociacionDeFutbolService.getAll();
    }

    @GetMapping("/{id}")
    public AsociacionDeFutbol getById(@PathVariable Long id){
        return asociacionDeFutbolService.getById(id);
    }

    @PostMapping
    public AsociacionDeFutbol save(@RequestBody AsociacionDeFutbol asociacionDeFutbol){
        return asociacionDeFutbolService.save(asociacionDeFutbol);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        asociacionDeFutbolService.delete(id);
    }


}
