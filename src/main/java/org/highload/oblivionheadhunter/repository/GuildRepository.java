package org.highload.oblivionheadhunter.repository;

import org.highload.oblivionheadhunter.model.entity.Guild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuildRepository extends JpaRepository<Guild, String> {

    Guild findByAdminName(String adminName);

}
