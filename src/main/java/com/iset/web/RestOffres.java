package com.iset.web;

import com.iset.dao.OffreRepository;
import com.iset.entities.Offre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Offres")
public class RestOffres {
    @Autowired
    OffreRepository OffreRepository;
    @GetMapping
    public List<Offre> getAll() {
        return OffreRepository.findAll();
    }
    @GetMapping("/{uid}")
    public Offre getByid(@PathVariable Long uid ) {
        return OffreRepository.findById(uid).get();
    }
    @PostMapping
    public Offre ajoutOffre(@RequestBody Offre newOffre){
        return OffreRepository.save(newOffre);
    }
    @DeleteMapping("/{id}")
    public void deleteOffre (@PathVariable Long id ) {
        OffreRepository.deleteById(id);
    }
}