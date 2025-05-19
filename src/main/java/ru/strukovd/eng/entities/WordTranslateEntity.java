package ru.strukovd.eng.entities;

import jakarta.persistence.*;
import lombok.Data;
import ru.strukovd.eng.enums.PartOfSpeech;

@Entity
@Table(name = "word_translate")
@Data
public class WordTranslateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "word_id")
    private Integer wordId;

    @Enumerated(EnumType.STRING)
    @Column(name = "part_of_speech", length = 20)
    private PartOfSpeech partOfSpeech;

    @Column(name = "translation", length = 50)
    private String translation;

    @Column(name = "meaning", length = 500)
    private String meaning;

    /* TODO:
        В entity для jsonb оставляем String, но в маппере
        для DTO преобразовать в List<String> (или Map<String, Object> если объект сложнее)
        делать это через @AfterMapping (?уточнить? или @Mapping над каждым полем)
        Хотя если с ними работа не ведется, то и парсить не обязательно (в целях экономии времени)

        Варианты:
        - создавать 2 разных метода (например: toDto, toDtoLite)
        - 2 разных DTO, например UserDto и UserLiteDto, возможно наследовать все поля от UserDto и переопределить те что будут упрощенные
        - Переопределение (ленивого) геттера, но нужно будет 2 поля (для хранения сырого и спаршенного значения).
        - "Использование Jackson MixIn" не понял
     */
    @Column(name = "synonyms", columnDefinition = "jsonb")
    private String synonyms;

    @Column(name = "antonyms", columnDefinition = "jsonb")
    private String antonyms;

    @Column(name = "transcription", length = 60)
    private String transcription;

    @Column(name = "level", length = 20)
    private String level;

    @Column(name = "frequency")
    private Short frequency;

    @Column(name = "tags", columnDefinition = "jsonb")
    private String tags;

    @Column(name = "image_prompts", columnDefinition = "jsonb")
    private String imagePrompts;
}