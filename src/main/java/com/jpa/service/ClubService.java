package com.jpa.service;

import com.jpa.entities.Club;
import com.jpa.repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;

    public List<Club> getAll(){
        return clubRepository.findAll();
    }

    public Club getById(Long id){
        return clubRepository.findById(id).orElse(null);
    }

    public Club save(Club club){
        return clubRepository.save(club);
    }

    public void delete(Long id){
        clubRepository.deleteById(id);
    }
}
