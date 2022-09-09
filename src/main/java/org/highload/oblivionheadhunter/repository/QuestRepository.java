package org.highload.oblivionheadhunter.repository;

import org.highload.oblivionheadhunter.model.entity.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestRepository extends JpaRepository<Quest, String> {

    Quest findByName(String name);

    List<Quest> findByHeroName(String heroName);

    List<Quest> findByHeroNameAndStatus(String heroName, String status);

    List<Quest> findByGuildNameAndStatus(String guildName, String status);

}
