package org.highload.oblivionheadhunter.mapper;

import org.highload.oblivionheadhunter.model.dto.request.NewQuestDto;
import org.highload.oblivionheadhunter.model.dto.response.QuestResponseDto;
import org.highload.oblivionheadhunter.model.entity.Guild;
import org.highload.oblivionheadhunter.model.entity.Quest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface QuestMapper {

    @Mapping(target = "name", expression = "java(newQuestDto.getName())")
    @Mapping(target = "guild", source = "guild")
    @Mapping(target = "hero", expression = "java(null)")
    @Mapping(target = "status", expression = "java(\"NEW\")")
    Quest mapToQuest(NewQuestDto newQuestDto, Guild guild);

    @Mapping(target = "guildName", expression = "java(quest.getGuild().getName())")
    @Mapping(target = "heroName", expression = "java(quest.getHero() != null ? quest.getHero().getName() : \"\")")
    QuestResponseDto mapToResponseDto(Quest quest);

}
