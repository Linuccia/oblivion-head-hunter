package org.highload.oblivionheadhunter.mapper;

import lombok.RequiredArgsConstructor;
import org.highload.oblivionheadhunter.model.dto.request.RegisterHeroDto;
import org.highload.oblivionheadhunter.model.dto.response.HeroInfoDto;
import org.highload.oblivionheadhunter.model.entity.Attributes;
import org.highload.oblivionheadhunter.model.entity.Hero;
import org.highload.oblivionheadhunter.model.entity.HeroClass;
import org.highload.oblivionheadhunter.model.entity.Race;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
@RequiredArgsConstructor
public abstract class HeroMapper {

    @Mapping(target = "raceName", expression = "java(hero.getRace().getName())")
    @Mapping(target = "className", expression = "java(hero.getHeroClass().getName())")
    abstract HeroInfoDto mapToInfoDto(Hero hero);

    Hero mapToHero(RegisterHeroDto registerHeroDto, Race race, HeroClass heroClass) {
        Attributes attributes = Attributes.builder()
                .power(race.getAttributes().getPower() + heroClass.getAttributes().getPower())
                .intellect(race.getAttributes().getIntellect() + heroClass.getAttributes().getIntellect())
                .willpower(race.getAttributes().getWillpower() + heroClass.getAttributes().getWillpower())
                .dexterity(race.getAttributes().getDexterity() + heroClass.getAttributes().getDexterity())
                .speed(race.getAttributes().getSpeed() + heroClass.getAttributes().getSpeed())
                .endurance(race.getAttributes().getEndurance() + heroClass.getAttributes().getEndurance())
                .charm(race.getAttributes().getCharm() + heroClass.getAttributes().getCharm())
                .luck(race.getAttributes().getLuck() + heroClass.getAttributes().getLuck())
                .build();
        return Hero.builder()
                .name(registerHeroDto.getName())
                .gender(registerHeroDto.getGender())
                .level(registerHeroDto.getLevel())
                .race(race)
                .heroClass(heroClass)
                .attributes(attributes)
                .build();
    }

}
