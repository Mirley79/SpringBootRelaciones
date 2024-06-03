package com.jpa.controller;

import com.jpa.entities.CompeticionesDeFutbol;
import com.jpa.service.CompeticionesDeFutbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relations/competiciones")
public class CompeticionesDeFutbolController {

    @Autowired
    private CompeticionesDeFutbolService competicionesDeFutbolService;

    @GetMapping
    public List<CompeticionesDeFutbol> getAll(){
        return competicionesDeFutbolService.getAll();
    }

    @GetMapping("/{id}")
    public CompeticionesDeFutbol getById(@PathVariable Long id){
        return competicionesDeFutbolService.getById(id);
    }

    @PostMapping
    public CompeticionesDeFutbol save(@RequestBody CompeticionesDeFutbol competicionesDeFutbol){
        return competicionesDeFutbolService.save(competicionesDeFutbol);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        competicionesDeFutbolService.delete(id);
    }
}
