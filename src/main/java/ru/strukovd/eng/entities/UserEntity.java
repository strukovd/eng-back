package ru.strukovd.eng.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    private String password;
    private String displayName;

    @Column(columnDefinition = "timestamp default now()")
    private LocalDateTime created;
    private Long createdBy;
    private LocalDateTime updated;
    private Long updatedBy;
    private LocalDateTime removed;
    private Long removedBy;
}
