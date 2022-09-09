package org.highload.oblivionheadhunter.controller;

import org.highload.oblivionheadhunter.model.dto.response.GuildEnterRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/requests")
public class RequestController {

    @GetMapping
    ResponseEntity<List<GuildEnterRequestDto>> showGuildEnterRequests() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    ResponseEntity<?> sendEnterRequest(@RequestParam String guildName) {
        return ResponseEntity.ok("");
    }

    @PostMapping("/approve")
    ResponseEntity<?> approveEnterRequest(@RequestParam Long requestId, @RequestParam Boolean decision) {
        return ResponseEntity.ok("");
    }

}
