package org.highload.oblivionheadhunter.repository;

import org.highload.oblivionheadhunter.model.entity.HeroClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroClassRepository extends JpaRepository<HeroClass, String> {

    HeroClass findByName(String name);

}
