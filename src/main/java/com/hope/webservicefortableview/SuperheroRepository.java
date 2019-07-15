package com.hope.webservicefortableview;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SuperheroRepository extends JpaRepository<Superhero, Long> {

    Superhero getSuperheroByName(String name);
    Collection<Superhero> getAllSuperheroes();
    Collection<Superhero> getAllSuperherosByBirthPlace(String birthPlace);
    
}