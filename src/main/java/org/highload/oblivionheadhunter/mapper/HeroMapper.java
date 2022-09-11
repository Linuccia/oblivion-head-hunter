package org.highload.oblivionheadhunter.mapper;

import lombok.RequiredArgsConstructor;
import org.highload.oblivionheadhunter.model.dto.request.RegisterHeroDto;
import org.highload.oblivionheadhunter.model.dto.response.HeroInfoDto;
import org.highload.oblivionheadhunter.model.entity.Attributes;
import org.highload.oblivionheadhunter.model.entity.Galaxy;
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
    @Mapping(target = "galaxyName", expression = "java(hero.getGalaxy().getName())")
    abstract HeroInfoDto mapToInfoDto(Hero hero);

    Hero mapToHero(RegisterHeroDto registerHeroDto, Race race, HeroClass heroClass, Galaxy galaxy) {
        Attributes attributes = Attributes.builder()
                .power(race.getAttributes().getPower() + heroClass.getAttributes().getPower()
                        + galaxy.getAttributes().getPower())
                .intellect(race.getAttributes().getIntellect() + heroClass.getAttributes().getIntellect()
                        + galaxy.getAttributes().getIntellect())
                .willpower(race.getAttributes().getWillpower() + heroClass.getAttributes().getWillpower()
                        + galaxy.getAttributes().getWillpower())
                .dexterity(race.getAttributes().getDexterity() + heroClass.getAttributes().getDexterity()
                        + galaxy.getAttributes().getDexterity())
                .speed(race.getAttributes().getSpeed() + heroClass.getAttributes().getSpeed()
                        + galaxy.getAttributes().getSpeed())
                .endurance(race.getAttributes().getEndurance() + heroClass.getAttributes().getEndurance()
                        + galaxy.getAttributes().getEndurance())
                .charm(race.getAttributes().getCharm() + heroClass.getAttributes().getCharm()
                        + galaxy.getAttributes().getCharm())
                .luck(race.getAttributes().getLuck() + heroClass.getAttributes().getLuck()
                        + galaxy.getAttributes().getLuck())
                .build();
        return Hero.builder()
                .name(registerHeroDto.getName())
                .gender(registerHeroDto.getGender())
                .level(registerHeroDto.getLevel())
                .race(race)
                .heroClass(heroClass)
                .galaxy(galaxy)
                .attributes(attributes)
                .build();
    }

}
