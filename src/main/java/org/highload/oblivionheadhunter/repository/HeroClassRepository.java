package org.highload.oblivionheadhunter.repository;

import org.highload.oblivionheadhunter.model.entity.HeroClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HeroClassRepository extends JpaRepository<HeroClass, String> {

    Optional<HeroClass> findByName(String name);

}
