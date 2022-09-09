package org.highload.oblivionheadhunter.repository;

import org.highload.oblivionheadhunter.model.entity.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Integer> {

    Optional<Reward> findById(Long id);

}
