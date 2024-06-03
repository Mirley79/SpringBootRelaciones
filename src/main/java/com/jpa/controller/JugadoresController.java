package com.jpa.controller;

import com.jpa.entities.Jugadores;
import com.jpa.service.JugadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relations/jugadores")
public class JugadoresController {

    @Autowired
    private JugadoresService jugadoresService;

    @GetMapping
    public List<Jugadores> getAll(){
        return jugadoresService.getAll();
    }

    @GetMapping("/{id}")
    public Jugadores getById(@PathVariable Long id){
        return jugadoresService.getById(id);
    }

    @PostMapping
    public Jugadores save(@RequestBody Jugadores jugadores){
        return jugadoresService.save(jugadores);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        jugadoresService.delete(id);
    }
}
