package org.highload.oblivionheadhunter.repository;

import org.highload.oblivionheadhunter.model.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {

    List<Request> findByGuildName(String guildName);

    Optional<Request> findById(Long id);

}
