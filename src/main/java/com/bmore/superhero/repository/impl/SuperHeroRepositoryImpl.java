package com.bmore.superhero.repository.impl;

import java.util.List;

import com.bmore.superhero.model.SuperHero;
import com.bmore.superhero.repository.SuperHeroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SuperHeroRepositoryImpl implements SuperHeroRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(SuperHero s) {
        Object[] params = {s.getBirthName(), s.getAlterName(), s.getBirthdayDate(), s.getOriginPlace(), s.getSuperPower()};
        jdbcTemplate.update("INSERT INTO superhero (birthName, alterName, birthdayDate, originPlace, superPower) VALUES(?, ?, ?, ?, ?)", params);
    }

    @Override
    public List<SuperHero> readAll() {
        return jdbcTemplate.query("SELECT * FROM superhero", BeanPropertyRowMapper.newInstance(SuperHero.class));
    }

    @Override
    public void update(SuperHero s) {
        Object[] params = {s.getBirthName(), s.getAlterName(), s.getBirthdayDate(), s.getOriginPlace(), s.getSuperPower(), s.getSuperheroId()};
        jdbcTemplate.update("UPDATE superhero SET birthName = ?, alterName = ?, birthdayDate = ?, originPlace = ?, superPower = ? WHERE superheroId = ?", params);
    }

    @Override
    public void delete(Integer superHeroId) {
        jdbcTemplate.update("DELETE superhero WHERE superHeroId = ?", superHeroId);
    }
}
