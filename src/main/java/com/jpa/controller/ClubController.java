package com.jpa.controller;

import com.jpa.entities.Club;
import com.jpa.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relations/clubs")
public class ClubController {

    @Autowired
    private ClubService clubService;

    @GetMapping
    public List<Club> getAll(){
        return clubService.getAll();
    }

    @GetMapping("/{id}")
    public Club geyById(@PathVariable Long id){
        return clubService.getById(id);
    }

    @PostMapping
    public Club save(@RequestBody Club club){
        return clubService.save(club);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        clubService.delete(id);
    }


}
