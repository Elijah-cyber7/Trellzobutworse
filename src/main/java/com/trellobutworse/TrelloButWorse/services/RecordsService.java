package com.trellobutworse.TrelloButWorse.services;

import com.trellobutworse.TrelloButWorse.dtos.GymRecordDto;
import com.trellobutworse.TrelloButWorse.entities.GymRecord;
import com.trellobutworse.TrelloButWorse.repositories.GymRecordsRepository;
import lombok.RequiredArgsConstructor;
import mappers.GymRecordMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
@RequiredArgsConstructor
public class RecordsService {

    private final GymRecordsRepository gymRecordsRepository;
    private final GymRecordMapper gymRecordMapper;


    public List<GymRecordDto> allRecords() {
       return  gymRecordMapper.toGymRecordDtos(gymRecordsRepository.findAll());
    }

    public GymRecordDto createGymRecord(GymRecordDto gymRecordDto) {
        GymRecord gymRecord = gymRecordMapper.toGymRecord(gymRecordDto);

        GymRecord createdGymRecord = gymRecordsRepository.save(gymRecord);

        return gymRecordMapper.toGymRecordDto(createdGymRecord);
    }
}
