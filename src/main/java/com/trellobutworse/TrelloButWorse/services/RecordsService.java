package com.trellobutworse.TrelloButWorse.services;

import com.trellobutworse.TrelloButWorse.dtos.GymRecordDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class RecordsService {
    public List<GymRecordDto> allRecords() {
        return Arrays.asList(
                new GymRecordDto(1L, "Bench press", 130),
                new GymRecordDto(1L,"Squat" , 130)
        );
    }
}
