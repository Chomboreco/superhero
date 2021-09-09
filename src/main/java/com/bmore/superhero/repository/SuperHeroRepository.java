package com.bmore.superhero.repository;

import java.util.List;

import com.bmore.superhero.model.SuperHero;

public interface SuperHeroRepository {
    public void create(SuperHero s);
    public List<SuperHero> readAll();
    public void update(SuperHero s);
    public void delete(Integer superHeroId);
}
