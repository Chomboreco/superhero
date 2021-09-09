package com.bmore.superhero.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SuperHero {
    private Integer superheroId;
    private String birthName;
    private String alterName;
    private Date birthdayDate;
    private String originPlace;
    private String superPower;

}
