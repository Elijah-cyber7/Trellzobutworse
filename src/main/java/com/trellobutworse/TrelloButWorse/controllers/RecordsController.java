package com.trellobutworse.TrelloButWorse.controllers;


import com.trellobutworse.TrelloButWorse.dtos.GymRecordDto;
import com.trellobutworse.TrelloButWorse.services.RecordsService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecordsController {

    private final RecordsService recordsService;

    @GetMapping("/gym/records")
    public ResponseEntity<List<GymRecordDto>> allRecords(){
        return ResponseEntity.ok(recordsService.allRecords());
    }

    @PostMapping("/gym/records")
    public ResponseEntity<GymRecordDto> createRecord(@RequestBody GymRecordDto gymRecordDto){
        GymRecordDto createdGymRecord = recordsService.createGymRecord(gymRecordDto);
        return ResponseEntity.created(URI.create("/gym/records/" + createdGymRecord.getId()))
                .body(createdGymRecord);
    }
}
