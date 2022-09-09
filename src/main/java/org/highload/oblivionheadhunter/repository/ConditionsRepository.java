package org.highload.oblivionheadhunter.repository;

import org.highload.oblivionheadhunter.model.entity.Conditions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConditionsRepository extends JpaRepository<Conditions, Integer> {

    Optional<Conditions> findById(Integer id);

}
