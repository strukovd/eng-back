package ru.strukovd.eng.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class WordDto {
    private int id;
    private String key;


    @NotNull(message = "Word is required")
    private String word;
//    private translation jsonb
}
