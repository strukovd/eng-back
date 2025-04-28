package ru.strukovd.eng.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.strukovd.eng.dtos.WordDto;
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

    @PostMapping
    public String path(@RequestBody @Valid WordDto body) {
        System.out.println(body);
        return "Path!";
    }
}
