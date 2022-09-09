package org.highload.oblivionheadhunter.repository;

import org.highload.oblivionheadhunter.model.entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends JpaRepository<Race, String> {

    Race findByName(String name);

}
