package com.example.terramodusvtll.controller;
import com.example.terramodusvtll.entities.TypeDevis;
import com.example.terramodusvtll.repositories.TypeDevisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/type-devis")
public class TypeDevisController {
    @Autowired
    private TypeDevisRepository typeDevisRepository;

    @PostMapping("/")
    public void saveTypeDevise(@RequestBody TypeDevis typeDevis) {
        typeDevisRepository.save(typeDevis);
    }
    @GetMapping("/")
    public List<TypeDevis> findAll() {
        return typeDevisRepository.findAll();
    }
    @GetMapping("/id/{id}")
    public TypeDevis findById(@PathVariable Long id) {
        return typeDevisRepository.getOne(id);
    }

}
