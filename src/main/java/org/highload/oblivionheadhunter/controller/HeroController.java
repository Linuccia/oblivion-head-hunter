package org.highload.oblivionheadhunter.controller;

import org.highload.oblivionheadhunter.model.dto.response.HeroInfoDto;
import org.highload.oblivionheadhunter.model.entity.Hero;
import org.highload.oblivionheadhunter.model.entity.Quest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    @GetMapping("/info")
    ResponseEntity<HeroInfoDto> showHeroInfo(@RequestParam String name) {
        return ResponseEntity.ok(new HeroInfoDto());
    }

    @GetMapping("/quests")
    ResponseEntity<List<Quest>> showHeroQuests(@RequestParam String heroName) {
        return ResponseEntity.ok(new ArrayList<>());
    }

}
