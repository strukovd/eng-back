package ru.strukovd.eng.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "words")
@Data
public class WordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String key;

    @Column(nullable = false)
    private String word;

    @Column(columnDefinition = "jsonb")
//    @Convert(converter = JsonbConverter.class)
//    private Map<String, Object> translations;
    private String translations;

    @Column(name = "part_of_speech", length = 50)
    private String partOfSpeech;

    @Column(columnDefinition = "text")
    private String definition;

    @Column(columnDefinition = "text")
    private String example;

    @Column(columnDefinition = "jsonb")
//    @Convert(converter = JsonbConverter.class)
//    private Map<String, Object> synonyms;
    private String synonyms;

    @Column(columnDefinition = "jsonb")
//    @Convert(converter = JsonbConverter.class)
//    private Map<String, Object> antonyms;
    private String antonyms;

    private String pronunciation;

    @Column(length = 20)
    private String level;

    private Integer frequency;

    @Column(columnDefinition = "jsonb")
//    @Convert(converter = JsonbConverter.class)
//    private Map<String, Object> tags;
    private String tags;

    private LocalDateTime lastReviewed;

    private Short score;

    private String imageUrl;

    private String audioUrl;

    @Column(nullable = false)
    private LocalDateTime createdAt;
}