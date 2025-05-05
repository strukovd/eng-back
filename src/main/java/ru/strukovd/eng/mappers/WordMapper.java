package ru.strukovd.eng.mappers;

import org.mapstruct.Mapper;
import ru.strukovd.eng.dtos.WordDto;
import ru.strukovd.eng.entities.WordEntity;

@Mapper(componentModel = "spring")
public interface WordMapper {
    public WordDto toDto(WordEntity wordEntity);
    public WordEntity toEntity(WordDto wordDto);
}
