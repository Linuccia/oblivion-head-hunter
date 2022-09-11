package org.highload.oblivionheadhunter.mapper;

import org.highload.oblivionheadhunter.model.dto.response.GuildEnterRequestDto;
import org.highload.oblivionheadhunter.model.entity.Guild;
import org.highload.oblivionheadhunter.model.entity.Hero;
import org.highload.oblivionheadhunter.model.entity.Request;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = HeroMapper.class)
public interface RequestMapper {

    @Mapping(target = "id", expression = "java(0L)")
    @Mapping(target = "hero", source = "hero")
    @Mapping(target = "guild", source = "guild")
    Request mapToEnterRequest(Hero hero, Guild guild);

    @Mapping(target = "heroInfo", source = "hero")
    GuildEnterRequestDto mapToEnterRequestDto(Request request);

}
