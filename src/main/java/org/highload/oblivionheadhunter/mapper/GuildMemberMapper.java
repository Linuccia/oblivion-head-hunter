package org.highload.oblivionheadhunter.mapper;

import org.highload.oblivionheadhunter.model.dto.response.GuildMemberDto;
import org.highload.oblivionheadhunter.model.entity.GuildMember;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GuildMemberMapper {

    @Mapping(target = "heroName", expression = "java(guildMember.getId().getHero().getName())")
    GuildMemberDto mapToDto(GuildMember guildMember);

}
