package ru.strukovd.eng.services;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WordService {
    public List<String> getList() {
        return List.of("string1", "string2", "string3");
    }
}
