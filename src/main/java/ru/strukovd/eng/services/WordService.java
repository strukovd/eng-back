package ru.strukovd.eng.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.strukovd.eng.dtos.WordDto;
import ru.strukovd.eng.entities.WordEntity;
import ru.strukovd.eng.mappers.WordMapper;
import ru.strukovd.eng.repositories.WordRepository;

import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class WordService {
    private final WordRepository wordRepository;
    private final WordMapper wordMapper;

    public Page<WordDto> getList(Pageable pageable) {
        Page<WordEntity> wordList = wordRepository.findAll(pageable);

        return wordList
                .map(wordMapper::toDto);
    }
}
