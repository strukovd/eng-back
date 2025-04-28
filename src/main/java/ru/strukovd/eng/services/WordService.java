package ru.strukovd.eng.services;

import lombok.Getter;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Getter
public class WordService {
    public List<String> getList() {
        return List.of("string1", "string2", "string3");
    }
}
