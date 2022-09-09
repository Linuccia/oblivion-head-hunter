package org.highload.oblivionheadhunter.repository;

import org.highload.oblivionheadhunter.model.entity.Attributes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AttributesRepository extends JpaRepository<Attributes, Long> {

    Optional<Attributes> findById(Long id);

}
