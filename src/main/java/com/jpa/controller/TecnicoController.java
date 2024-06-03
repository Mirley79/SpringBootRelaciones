package com.jpa.controller;

import com.jpa.entities.Tecnico;
import com.jpa.service.TecnicoService;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relations/tecnico")
public class TecnicoController {

    @Autowired
    private TecnicoService tecnicoService;

    @RequestMapping
    public List<Tecnico> getAll(){
        return tecnicoService.getAll();
    }

    @RequestMapping("/{id}")
    public Tecnico getById(@PathVariable Long id){
        return tecnicoService.getById(id);
    }

    @PostMapping
    public Tecnico save(@RequestBody Tecnico tecnico){
        return tecnicoService.save(tecnico);
    }

    @PutMapping
    public Tecnico upDate(@RequestBody Tecnico tecnico){
        return tecnicoService.upDate(tecnico);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        tecnicoService.getById(id);
    }
}
