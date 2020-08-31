package alexandre.thiellin.pathfinder.controller;

import alexandre.thiellin.pathfinder.model.Character;
import alexandre.thiellin.pathfinder.model.Class;
import alexandre.thiellin.pathfinder.model.Race;
import alexandre.thiellin.pathfinder.repository.CharacterRepository;
import alexandre.thiellin.pathfinder.repository.ClassRepository;
import alexandre.thiellin.pathfinder.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PathfinderController {

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private RaceRepository raceRepository;

    public PathfinderController() {
    }

    // --------------- CHARACTERS -----------------

    @GetMapping(path = "/characters")
    public List<Character> getCharacters() {

        return characterRepository.findAll();
    }

    @GetMapping(path = "/characters/id/{id}")
    public ResponseEntity<Character> getCharacterById(@PathVariable long id) throws ResourceNotFoundException {

        Character character = characterRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There is no resources with id : "+id));
        return ResponseEntity.ok().body(character);
    }

    @GetMapping(path = "/characters/name/{name}")
    public ResponseEntity<Character> getCharacterByName(@PathVariable String name) throws ResourceNotFoundException {

        Character character = characterRepository.findByName(name).orElseThrow(() -> new ResourceNotFoundException("There is no resources with name : "+name));
        return ResponseEntity.ok().body(character);
    }

    // --------------- CLASSES -----------------

    @GetMapping(path = "/classes")
    public List<Class> getClasses() {
        return classRepository.findAll();
    }

    // --------------- RACES -----------------

    @GetMapping(path = "/races")
    public List<Race> getRaces() {
        return raceRepository.findAll();
    }
}
