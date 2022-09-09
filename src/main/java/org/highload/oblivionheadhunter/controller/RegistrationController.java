package org.highload.oblivionheadhunter.controller;

import org.highload.oblivionheadhunter.model.dto.request.RegisterHeroDto;
import org.highload.oblivionheadhunter.model.dto.response.HeroInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @PostMapping
    ResponseEntity<HeroInfoDto> registerHero(@RequestBody RegisterHeroDto registerHeroDto) {
        return ResponseEntity.ok(new HeroInfoDto());
    }

}
