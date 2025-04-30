package ru.strukovd.eng.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.strukovd.eng.entities.WordEntity;
import ru.strukovd.eng.repositories.WordRepository;

import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class WordService {
    private final WordRepository wordRepository;

    public List<String> getList() {
        List<WordEntity> list = wordRepository.findAll();

        System.out.println(list);

        return list.stream().map(WordEntity::getWord).toList();
    }
}
