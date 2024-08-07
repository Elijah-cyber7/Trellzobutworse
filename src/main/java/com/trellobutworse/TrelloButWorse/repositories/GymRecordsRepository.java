package com.trellobutworse.TrelloButWorse.repositories;

import com.trellobutworse.TrelloButWorse.entities.GymRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRecordsRepository extends JpaRepository<GymRecord, Long> {
}
