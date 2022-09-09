package org.highload.oblivionheadhunter.repository;

import org.highload.oblivionheadhunter.model.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<Hero, String> {

    Hero findByName(String name);

}
