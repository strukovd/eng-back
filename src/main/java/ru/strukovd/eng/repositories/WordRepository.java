package ru.strukovd.eng.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.strukovd.eng.entities.WordEntity;

@Repository
public interface WordRepository extends JpaRepository<WordEntity, Long> {
}
