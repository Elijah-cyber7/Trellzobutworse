package mappers;


import com.trellobutworse.TrelloButWorse.dtos.GymRecordDto;
import com.trellobutworse.TrelloButWorse.entities.GymRecord;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GymRecordMapper {

    GymRecord toGymRecord(GymRecordDto dto);

    GymRecordDto toGymRecordDto(GymRecord gymRecord);

    List<GymRecordDto> toGymRecordDtos(List<GymRecord> gymRecords);
}
