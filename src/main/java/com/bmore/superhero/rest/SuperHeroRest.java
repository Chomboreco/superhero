package com.bmore.superhero.rest;

import java.util.List;

import com.bmore.superhero.model.SuperHero;
import com.bmore.superhero.repository.SuperHeroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperHeroRest {

    @Autowired
    private SuperHeroRepository superHeroRepository;

    @GetMapping(value = "/create")
    public String create(@RequestBody SuperHero s) {
        superHeroRepository.create(s);
        return "Created";
    }

    @GetMapping(value = "/read")
    public List<SuperHero> readAll() {
        return superHeroRepository.readAll();
    }

    @GetMapping(value = "/update")
    public String update(@RequestBody SuperHero s) {
        superHeroRepository.update(s);
        return "Updated";
    }

    @GetMapping(value = "/detele/{}")
    public String delete(@PathVariable(name = "superHeroId") Integer superHeroId) {
        superHeroRepository.delete(superHeroId);

        return "Deleted";
    }
}
