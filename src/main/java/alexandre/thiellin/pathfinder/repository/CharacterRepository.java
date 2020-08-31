package alexandre.thiellin.pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import alexandre.thiellin.pathfinder.model.Character;

import java.util.Optional;

public interface CharacterRepository extends JpaRepository<Character, Long> {

    Optional<Character> findByName(String name);
}
