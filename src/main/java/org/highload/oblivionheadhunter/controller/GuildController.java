package org.highload.oblivionheadhunter.controller;

import org.highload.oblivionheadhunter.model.dto.response.GuildMemberDto;
import org.highload.oblivionheadhunter.model.dto.response.QuestResponseDto;
import org.highload.oblivionheadhunter.model.entity.Guild;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/guilds")
public class GuildController {

    @GetMapping
    ResponseEntity<List<Guild>> showAllGuilds() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/info")
    ResponseEntity<Guild> showGuildInfo(@RequestParam String guildName) {
        return ResponseEntity.ok(new Guild());
    }

    @GetMapping("/members")
    ResponseEntity<List<GuildMemberDto>> showGuildMembers(@RequestParam String guildName) {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PutMapping("/members")
    ResponseEntity<GuildMemberDto> changeMemberRang(@RequestParam String heroName, @RequestParam String newRang) {
        return ResponseEntity.ok(new GuildMemberDto());
    }

    @GetMapping("/quests")
    ResponseEntity<List<QuestResponseDto>> showGuildQuests(@RequestParam String guildName) {
        return ResponseEntity.ok(new ArrayList<>());
    }

}
