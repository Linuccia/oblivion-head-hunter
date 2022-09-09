package org.highload.oblivionheadhunter.controller;

import org.highload.oblivionheadhunter.model.dto.request.LoginHeroDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthorizationController {

    @PostMapping
    ResponseEntity<?> login(@RequestBody LoginHeroDto loginHeroDto) {
        return ResponseEntity.ok("");
    }

}
