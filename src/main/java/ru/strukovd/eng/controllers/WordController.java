package ru.strukovd.eng.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.strukovd.eng.services.WordService;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/word")
@RequiredArgsConstructor
public class WordController {
    private final WordService wordService;

    @GetMapping
    public List<String> sayHello() {
        return wordService.getList();
    }

    @GetMapping("/path")
    public String path() {
        return "Path!";
    }
}
