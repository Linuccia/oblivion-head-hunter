package org.highload.oblivionheadhunter.repository;

import org.highload.oblivionheadhunter.model.entity.GuildMember;
import org.highload.oblivionheadhunter.model.entity.GuildMemberId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GuildMemberRepository extends JpaRepository<GuildMember, GuildMemberId> {

    Optional<GuildMember> findById(GuildMemberId id);

    List<GuildMember> findByIdGuildName(String guildName);

}
