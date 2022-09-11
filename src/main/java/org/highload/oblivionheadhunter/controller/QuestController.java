package org.highload.oblivionheadhunter.controller;

import org.highload.oblivionheadhunter.model.dto.request.NewQuestDto;
import org.highload.oblivionheadhunter.model.dto.response.QuestResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quests")
public class QuestController {

    @GetMapping
    ResponseEntity<QuestResponseDto> showQuestInfo(@RequestParam String questName) {
        return ResponseEntity.ok(new QuestResponseDto());
    }

    @PostMapping
    ResponseEntity<QuestResponseDto> addNewQuest(@RequestBody NewQuestDto newQuestDto) {
        return ResponseEntity.ok(new QuestResponseDto());
    }

    @PutMapping
    ResponseEntity<?> finishQuest(@RequestBody String questName) {
        return ResponseEntity.ok("");
    }

}
